inputfile = open('input2.txt', 'r')

n = int(inputfile.readline())
array = list(map(int, inputfile.readline().split(" ")))

def minEdits(array, n):
    changes, check = 0, 0
    if n in [0, 1]:
        return changes
    else:
        check = array[0]

    for i in range(1, n):
        if check >= array[i]:
            array[i] = check + 1
            changes += 1
            check += 1
        else:
            check = array[i]
    return changes

print(minEdits(array, n))