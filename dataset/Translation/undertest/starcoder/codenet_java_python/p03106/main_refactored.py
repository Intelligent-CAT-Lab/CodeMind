class main:
    import sys
    
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a
    
    def lcm(a, b):
        return a * b / gcd(a, b)
    
    def main():
        A, B, K = map(int, sys.stdin.readline().strip().split())
        s = []
        for i in range(1, A+1):
            if A % i == 0 and B % i == 0:
                s.append(i)
        print(s[K-1])
    
    if __name__ == '__main__':
        main()