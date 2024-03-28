import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = sys.stdin.readline()
        return self.st.nextToken()

    def nextLine(self):
        return sys.stdin.readline()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def inArr(self, n):
        a = [0] * n
        self.st = sys.stdin.readline()
        for i in range(n):
            a[i] = int(self.st.nextToken())
        return a

sc = Scanner(sys.stdin)
out = sys.stdout

n = sc.nextInt()
x = sc.nextInt() - 1
y = sc.nextInt() - 1
edges = [0] * n

for i in range(n):
    for j in range(i+1, n):
        edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))+1)
        edges[edge] += 1

for i in range(1, n):
    out.write(str(edges[i]) + "\n")

out.close()