class p02768:
    m = 1000000007

    @staticmethod
    def pow(a, b):
        s = 1
        a2 = a
        while b > 0:
            if b & 1:
                s = s * a2 % p02768.m
            a2 = a2 * a2 % p02768.m
            b >>= 1
        return s
    
    @staticmethod
    def reverse(a):
        return p02768.pow(a, p02768.m - 2)

    @staticmethod
    def sub(n, a):
        if a > n // 2:
            a = n - a
        s1 = 1
        n2 = n - a
        for i in range(n, n2, -1):
            s1 = s1 * i % p02768.m
        s2 = 1
        for i in range(1, a + 1):
            s2 = s2 * i % p02768.m
        s3 = p02768.reverse(s2)
        return s1 * s3 % p02768.m

# Main method equivalent
if __name__ == "__main__":
    n = int(input())
    a = int(input())
    b = int(input())

    all = p02768.pow(2, n)

    answer = (all + 2 * p02768.m - p02768.sub(n, a) - p02768.sub(n, b) - 1) % p02768.m
    print(answer)