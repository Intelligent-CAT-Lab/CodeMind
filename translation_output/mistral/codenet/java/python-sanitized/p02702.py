import sys

def get_d(n, arr):
    d = [0] * (n+1)
    ten = 1
    for i in range(n-1, -1, -1):
        a = ((arr[i] - '0') * ten) % 2019
        d[i] = (d[i+1] + a) % 2019
        ten = (ten * 10) % 2019
    return d

def get_ans(n, d):
    ans = 0
    map = {}
    for i in range(n, -1, -1):
        key = d[i]
        if key not in map:
            map[key] = 1
        else:
            val = map[key]
            map[key] = val + 1
    for key in map:
        val = map[key]
        ans += (val * (val-1)) // 2
    return ans

if __name__ == "__main__":
    n = int(input())
    arr = list(map(int, input().split()))
    d = get_d(n, arr)
    ans = get_ans(n, d)
    print(ans)