class main:
    def collatz(n):
        s = set()
        s.add(n)
        i = 1
        while True:
            i += 1
            if n % 2 == 0:
                n = n // 2
            else:
                n = 3 * n + 1
            if n in s:
                return i
            else:
                s.add(n)
    
    print(collatz(8))