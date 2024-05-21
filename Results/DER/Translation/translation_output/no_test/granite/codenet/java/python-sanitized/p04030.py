import sys

def main():
    sc = FastScanner(sys.stdin)
    s = sc.next()
    t = ""
    for i in range(len(s)):
        if s[i]!= 'B':
            t += s[i]
        elif t == "":
            continue
        else:
            t = t[:-1]
    print(t)

#ä»¥ä¸ãèªä½ã©ã¤ãã©ãª

#éä¹
def fact(n):
    if n == 1 or n == 0:
        return 1
    else:
        return n * fact(n - 1)

#æå®ããå¤ä»¥ä¸ã®è¦ç´ ãæåã«ç¾ããä½ç½®
#è¦ç´ ã®æ°ã¯+1ï¼éåã®ãºã¬)
def lowerBound(n, x, y):
    left = 0
    right = n
    while left < right:
        mid = (left + right) // 2
        if x[mid] < y:
            left = mid + 1
        else:
            right = mid
    return left

#æå®ããå¤ããå¤§ããè¦ç´ ãæåã«ç¾ããä½ç½®
#è¦ç´ ã®æ°ã¯+1ï¼éåã®ãºã¬)
def upperBound(n, x, y):
    left = 0
    right = n
    while left < right:
        mid = (left + right) // 2
        if x[mid] <= y:
            left = mid + 1
        else:
            right = mid
    return left

#æå¤§å¬ç´æ°
def gcd(a, b):
    if a < b:
        return gcd(b, a)
    c = 0
    c = a % b
    if c == 0:
        return b
    return gcd(b, c)

#æå°å¬åæ°
def lcm(m, n):
    return m * n // gcd(m, n)

#ç´ æ°å¤å®
def isPrime(n):
    if n < 2:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False

    for i in range(3, int(n**0.5) + 1, 2):
        if n % i == 0:
            return False
    return True

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.current = 0
        self.buffer = []

    def next(self):
        if self.current >= len(self.buffer):
            self.buffer = self.stream.read().split()
            self.current = 0
        self.current += 1
        return self.buffer[self.current - 1]

    def nextInt(self):
        return int(self.next())

    def nextFloat(self):
        return float(self.next())

    def nextLine(self):
        return self.stream.readline().strip()

if __name__ == "__main__":
    main()