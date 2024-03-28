class main:
    import math
    
    class FastScanner:
        def __init__(self):
            self.reader = open("input.txt", "r")
            self.st = None
    
        def next(self):
            if self.st is None or not self.st.hasMoreElements():
                self.st = StringTokenizer(self.reader.readline())
            return self.st.nextToken()
    
        def nextLine(self):
            self.st = None
            return self.reader.readline()
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return long(self.next())
    
        def nextIntArr(self, n):
            retArr = [0] * n
            for i in range(n):
                retArr[i] = self.nextInt()
            return retArr
    
        def nextLongArr(self, n):
            retArr = [0] * n
            for i in range(n):
                retArr[i] = self.nextLong()
            return retArr
    
        def close(self):
            self.reader.close()
    
    class p02690:
        def __init__(self):
            self.maxDiff = 1000000000
    
        def solve(self):
            fs = FastScanner()
            x = fs.nextInt()
    
            powMap = {}
            powMap[0] = 0
            powMap[1] = 1
    
            beforePow = 1
            base = 2
            while True:
                powVal = pow(base, 5)
                powMap[powVal] = base
                if powVal - beforePow > x:
                    break
                base += 1
                beforePow = powVal
    
            for powVal, base in powMap.items():
                diff = abs(x - powVal)
                if diff in powMap:
                    print(base, end=" ")
                    if powVal - x < 0:
                        print("-", powMap[diff], sep="")
                    else:
                        print(powMap[diff], sep="")
                    print()
                    return
    
    def pow(base, n):
        retVal = 1
        while n > 0:
            if n & 1 == 1:
                retVal *= base
            n >>= 1
            base *= base
        return retVal
    
    if __name__ == "__main__":
        p02690().solve()