import sys

def input():
    global n
    n = int(input())
    arr = list(map(int, input().split()))
    return arr

def solve():
    global n
    n = len(arr)
    arr.sort()
    ans = 0
    for i in range(n):
        ans += arr[i]
    return ans

if __name__ == "__main__":
    arr = input()
    ans = solve()
    print(ans)