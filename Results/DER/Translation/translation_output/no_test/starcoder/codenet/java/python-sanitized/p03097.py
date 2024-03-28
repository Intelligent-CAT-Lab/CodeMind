import sys

def dropBit(n, index):
    higher = (n >> (index + 1)) << index
    lower = (n & ((1 << index) - 1))
    return higher | lower

def insertBit(n, index, v):
    higher = ((n >> index) << (index + 1))
    lower = (n & ((1 << index) - 1))
    return higher | lower | v

def solveSub(n, a, b):
    if n == 1:
        if a!= b:
            return [a, b]
        else:
            return None
    for i in range(n):
        aBit = (a >> i) & 1
        bBit = (b >> i) & 1
        if aBit!= bBit:
            aDash = dropBit(a, i)
            bDash = dropBit(b, i)
            c = aDash ^ 1
            path1 = solveSub(n - 1, aDash, c)
            path2 = solveSub(n - 1, c, bDash)
            if path1!= None and path2!= None:
                path = []
                for v in path1:
                    path.append(insertBit(v, i, aBit << i))
                for v in path2:
                    path.append(insertBit(v, i, bBit << i))
                return path
            return None
    return None

def solve(n, a, b):
    path = solveSub(n, a, b)
    if path == None:
        return ["NO"]
    sb = []
    sb.append(path[0])
    for i in range(1, len(path)):
        sb.append(" ")
        sb.append(path[i])
    return ["YES", "".join(sb)]

def execute(reader, out):
    n = reader.nextInt()
    a = reader.nextInt()
    b = reader.nextInt()
    for line in solve(n, a, b):
        out.println(line)

class ContestReader:
    def __init__(self, in_stream):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = java.util.StringTokenizer(self.reader.readLine())
            except Exception as e:
                raise RuntimeException(e)
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong