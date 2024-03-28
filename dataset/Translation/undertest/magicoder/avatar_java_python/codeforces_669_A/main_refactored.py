class main:
    class FastReader:
        def __init__(self):
            self.br = open(0, 'r')
    
        def next(self):
            return self.br.readline().strip()
    
        def nextInt(self):
            return int(self.next())
    
    def codeforces_669_A(n):
        total = 0
        if n == 2:
            return 1
        while n > 0:
            n -= 1
            if n > 0:
                if n >= 2:
                    total += 1
                n -= 2
            total += 1
        return total
    
    if __name__ == "__main__":
        fr = FastReader()
        n = fr.nextInt()
        print(codeforces_669_A(n))