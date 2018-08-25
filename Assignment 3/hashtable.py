class HashTable:
    def __init__(self, m):
        self.tableSize = m
        self.table = [[] for i in range(m)]
        
    def hashCode(self, string):
        stringList = list(string)
        total = 0
        for i in range(len(stringList)):
            total += ord(stringList[i]) * (263 ** i)
        return (total % 1000000007 % self.tableSize)
        
    def add(self, string):
        position = self.hashCode(string)
        if string in self.table[position]:
            pass
        else:
            self.table[position].insert(0, string)
    
    def delete(self, string):
        position = self.hashCode(string)
        if string in self.table[position]:
            self.table[position].remove(string)
        else:
            pass
        
    def find(self, string):
        position = self.hashCode(string)
        if string in self.table[position]:
            print ("yes")
        else:
            print ("no")
        
    def check(self, string):
        i = int(string)
        if i < self.tableSize:
            print (" ".join(self.table[i]))
        else:
            print("(invalid i for check query)")

inputFile = open("input.txt", "r")
m = int(inputFile.readline().rstrip())
N = int(inputFile.readline().rstrip())
queries = list(map(lambda x: x.rstrip() , inputFile.readlines()))

hT = HashTable(m)

for query in queries:
    command, string = query.split(' ', 1)
    if command == "add":
        hT.add(string)
    elif command == "del":
        hT.delete(string)
    elif command == "find":
        hT.find(string)
    elif command == "check":
        hT.check(string)
    else:
        print ("invalid command")