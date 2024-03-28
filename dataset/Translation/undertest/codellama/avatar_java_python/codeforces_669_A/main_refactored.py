class main:
    import sys
    
    class FastReader:
        def __init__(self):
            self.br = sys.stdin
            self.st = sys.stdin.readline().split()
    
        def next(self):
            while not self.st:
                try:
                    self.st = self.br.readline().split()
                except:
                    pass
            return self.st.pop(0)
    
        def read_array(self, n):
            a = [0] * n
            for i in range(n):
                a[i] = self.next_int()
            return a
    
        def next_int(self):
            return int(self.next())
    
        def next_long(self):
            return long(self.next())
    
    def codeforces_669_A(args):
        fr = FastReader()
        n = fr.next_int()
        sum = 0
        total = 0
        i = 1
        if n == 2:
            print(1)
            return
        while n > 0:
            n -= 1
            if n > 0:
                if n >= 2:
                    total += 1
                n -= 2
            total += 1
        print(total)
    
    if __name__ == "__main__":
        codeforces_669_A(sys.argv[1:])