class main:
    class p00509:
        def __init__(self):
            pass
        
        def run(self):
            n, c = map(int, input().split())
            num = [0] * n
            if c < 0:
                if n == 1:
                    print(11)
                else:
                    for i in range(n * 2):
                        print(9, end='')
                    print()
            else:
                a = 1
                for i in range(n):
                    a *= 10
                b = a // 10
                a -= 1
                for i in range(a, b-1, -1):
                    if self.check(i, c):
                        return
        
        def check(self, i, c):
            builder = str(i)
            builder2 = builder[::-1]
            builder += str(c) + builder2
            if self.prime(int(builder)):
                print(builder)
                return True
            else:
                return False
    
        def prime(self, b):
            for i in range(2, int(b ** 0.5)+1):
                if b % i == 0:
                    return False
            return True
    
    p = p00509()
    p.run()