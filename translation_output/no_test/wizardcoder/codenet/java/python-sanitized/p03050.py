import math

def p03050():
    n = int(input())
    ans = 0
    for i in range(1, int(math.sqrt(n))+1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                ans += m
    print(ans)

if __name__ == '__main__':
    p03050()