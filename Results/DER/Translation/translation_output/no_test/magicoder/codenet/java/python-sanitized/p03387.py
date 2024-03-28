import sys
import math

def main():
    x = [int(i) for i in input().split()]
    x.sort()
    temp = 2 * x[2] - x[1] - x[0]
    ans = temp // 2 if temp % 2 == 0 else (temp + 2) // 2 + 1
    print(ans)

if __name__ == "__main__":
    main()