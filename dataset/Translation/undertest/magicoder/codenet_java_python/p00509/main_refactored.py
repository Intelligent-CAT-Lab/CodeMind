class main:
    def run():
        n, c = map(int, input().split())
        num = [0] * n
        if c < 0:
            if n == 1:
                print(11)
            else:
                print('9' * (n * 2))
        else:
            a = 10 ** n
            b = a // 10
            a -= 1
            for i in range(a, b - 1, -1):
                if check(i, c):
                    return
    
    def check(i, c):
        builder = str(i) + str(c) + str(i)[::-1]
        if prime(int(builder)):
            print(builder)
            return True
        else:
            return False
    
    def prime(b):
        for i in range(2, int(b ** 0.5) + 1):
            if b % i == 0:
                return False
        return True
    
    run()