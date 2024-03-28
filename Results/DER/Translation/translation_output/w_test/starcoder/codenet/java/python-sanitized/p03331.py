import sys

def digit(num):
    r = 0
    while True:
        r += (num%10)
        num /= 10
        if num == 0: break
    return r

def main():
    n = int(sys.stdin.readline())
    ans = n
    for a in range(2, n/2+1):
        b = n - a
        sum = digit(a) + digit(b)
        ans = min(sum, ans)
    print ans

if __name__ == '__main__':
    main()