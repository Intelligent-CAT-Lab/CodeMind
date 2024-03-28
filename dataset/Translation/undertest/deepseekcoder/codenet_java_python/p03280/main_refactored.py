class main:
    class FastReader:
        def __init__(self):
            self.br = input()
    
        def next(self):
            return self.br
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return long(self.next())
    
        def nextDouble(self):
            return float(self.next())
    
        def nextLine(self):
            return self.br
    
    
    def main():
        sc = FastReader()
        k = sc.nextInt()-1
        b = sc.nextInt()-1
        print(k*b)
    
    
    if __name__ == "__main__":
        main()