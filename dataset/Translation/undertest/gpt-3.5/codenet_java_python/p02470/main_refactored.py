class main:
    class Euler:
        def __init__(self, n):
            self.phi = [i for i in range(1, n+1)]
            for i in range(2, n+1):
                if self.phi[i - 1] == i:
                    for j in range(i, n+1, i):
                        self.phi[j - 1] = self.phi[j - 1] // i * (i - 1)
    
        def totient(self, n):
            return self.phi[n - 1]
    
        @staticmethod
        def totient_long(n):
            i = n
            phi = n
            if i % 2 == 0:
                phi = phi // 2
                while i % 2 == 0:
                    i //= 2
            if i % 3 == 0:
                phi = phi // 3 * 2
                while i % 3 == 0:
                    i //= 3
            j = 1
            while True:
                tmp = j * 6 - 1
                if tmp * tmp > n:
                    break
                if i % tmp == 0:
                    phi = phi // tmp * (tmp - 1)
                    while i % tmp == 0:
                        i //= tmp
                tmp = j * 6 + 1
                if tmp * tmp > n:
                    break
                if i % tmp == 0:
                    phi = phi // tmp * (tmp - 1)
                    while i % tmp == 0:
                        i //= tmp
                j += 1
            if i != 1:
                phi = phi // i * (i - 1)
            return phi
    
    if __name__ == "__main__":
        n = int(input())
        euler = Euler(n)
        print(euler.totient(n))