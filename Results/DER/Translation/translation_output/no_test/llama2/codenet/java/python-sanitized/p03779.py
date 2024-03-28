import math

def solve(x):
    ans = 0
    for i in range(100000):
        if x <= i * (i + 1) / 2:
            ans = i
            break
    return ans

if __name__ == '__main__':
    x = int(input())
    print(solve(x))