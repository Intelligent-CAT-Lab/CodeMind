import sys
import math

def main():
    s, t = map(int, sys.stdin.readline().split())
    mah = str(s) + str(t)
    a = int(mah)
    b = math.sqrt(a)
    if b * b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()