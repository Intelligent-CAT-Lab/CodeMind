import math

class p00509:

    def run(self):
        n, c = map(int, input().split())
        if c < 0:
            if n == 1:
                print(11)
            else:
                print(''.join(['9' for _ in range(n * 2)]))
        else:
            a = 10 ** n
            b = a // 10
            a -= 1
            for i in range(a, b - 1, -1):  # Subtracting 1 from b because range is exclusive on the stop argument
                if self.check(i, c):
                    return

    def check(self, i, c):
        builder = str(i)
        builder2 = builder[::-1]
        builder = builder + str(c) + builder2
        if self.prime(int(builder)):
            print(builder)
            return True
        else:
            return False

    def prime(self, b):
        if b < 2:
            return False
        for i in range(2, int(math.sqrt(b)) + 1):
            if b % i == 0:
                return False
        return True


p00509().run()