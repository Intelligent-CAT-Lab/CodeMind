class main:
    import sys
    
    class FastReader:
        def __init__(self):
            self.br = sys.stdin
            self.st = None
    
        def next(self):
            while self.st is None or not self.st.hasMoreElements():
                try:
                    self.st = sys.stdin.readline()
                except IOError:
                    pass
            return self.st.nextToken()
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return long(self.next())
    
        def nextDouble(self):
            return float(self.next())
    
        def nextLine(self):
            return self.br.readline()
    
    def main():
        sc = FastReader()
        k = sc.nextInt() - 1
        b = sc.nextInt() - 1
        print(k * b)
    
    if __name__ == "__main__":
        main()