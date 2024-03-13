import sys
import math

mod = 1000000007

def main():
    inp = sys.stdin.readline().strip()
    l = len(inp)

    if inp[0] == '0' or inp[-1] == '1':
        print(-1)
        return
    else:
        for i in range(l // 2):
            if inp[i] != inp[l - i - 2]:
                print(-1)
                return

    print(1, 2)

    for i in range(3, l + 1):
        print(2, i)
        if inp[i - 2] == '1':
            print(1, i)

def gcd(a, b):
    if min(a, b) == 0:
        return max(a, b)
    return gcd(max(a, b) % min(a, b), min(a, b))

if __name__ == "__main__":
    main()