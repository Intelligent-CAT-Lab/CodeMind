class main:
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
        sb.append(str(path[0]))
        for i in range(1, len(path)):
            sb.append(" ")
            sb.append(str(path[i]))
        return ["YES"] + sb
    
    def execute(reader, writer):
        n = reader.nextInt()
        a = reader.nextInt()
        b = reader.nextInt()
        for line in solve(n, a, b):
            writer.println(line)
    
    if __name__ == "__main__":
        reader = ContestReader(sys.stdin)
        writer = PrintWriter(sys.stdout)
        execute(reader, writer)
        writer.flush()
    
    class ContestReader:
        def __init__(self, stream):
            self.reader = BufferedReader(InputStreamReader(stream))
            self.tokenizer = None