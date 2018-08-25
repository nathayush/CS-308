inputfile = open('input1.txt', 'r')

vertices, edges = map(int, inputfile.readline().split(" "))
graph = [[0]*vertices for _ in range(vertices)]


for i in range(edges):
    u, v, w = map(int, inputfile.readline().split(" "))
    graph[u-1][v-1] = w
    graph[v-1][u-1] = w


def minWeightTree(graph, start = 0):
    MST = set()
    visited = set()

    visited.add(start) #arbitrary vertex to start with

    while len(visited) != vertices:
        crossing = set()
        for x in visited:
            for k in range(vertices):
                if k not in visited and graph[x][k] != 0:
                    crossing.add((x,k))

        edge = sorted(crossing, key = lambda i:graph[i[0]][i[1]])[0] #edge with the smallest weight

        MST.add(edge)
        visited.add(edge[1])

    total_weight = 0
    for edge in MST:
        total_weight += graph[edge[0]][edge[1]]
    return total_weight

print(minWeightTree(graph))