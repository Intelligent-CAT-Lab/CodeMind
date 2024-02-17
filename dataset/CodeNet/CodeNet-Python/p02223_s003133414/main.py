import sys
input = sys.stdin.readline
sys.setrecursionlimit(1000000)
from collections import deque, Counter
def getN():
    return int(input())
def getList():
    return list(map(int, input().split()))
import math


INF = 10 ** 20

def main():
    n = getN()
    if n == 1:
        print(1)
        print(1)
        return
    if n == 2:
        print(2)
        print(0)
        print("11")
        return

    print(n-1)
    print("11")
    for i in range(1, n-1):
        print("1" + "0" * i + "1")

    return
if __name__ == "__main__":
    main()
