class main:
    import sys
    
    class FastScanner:
        def __init__(self):
            self.br = sys.stdin
            self.st = sys.stdin.readline()
    
        def next(self):
            while not self.st.hasMoreTokens():
                try:
                    self.st = self.br.readline()
                except IOError:
                    print("Error reading from input stream")
                    return None
            return self.st.nextToken()
    
        def nextInt(self):
            return int(self.next())
    
        def readArray(self, n):
            a = []
            for i in range(n):
                a.append(self.nextInt())
            return a
    
        def nextLong(self):
            return long(self.next())
    
    def main():
        fs = FastScanner()
        x = fs.nextInt()
        if x >= 30:
            print("Yes")
        else:
            print("No")
    
    if __name__ == "__main__":
        main()