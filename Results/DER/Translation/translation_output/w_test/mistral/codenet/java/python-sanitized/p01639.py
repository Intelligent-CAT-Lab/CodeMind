import sys

n, k, x0 = map(int, input().split())

def solve():
    if x0 == 0:
        print("0")
        return

    x = x0
    s = 1 << 40
    count = [0] * s
    offset = 1 << 63
    M = s // (1 << 64)
    for i in range(n):
        at = (x + offset) * M
        if at < 0:
            at = 0
        if at >= s:
            at = s - 1
        count[at] += 1
        x ^= x << 13
        x ^= x >> 7
        x ^= x << 17

    sum = 0
    length = -1
    target = -1
    for i in range(s):
        if sum <= k and k < sum + count[i]:
            target = i
            length = count[i]
            break
        sum += count[i]

    now = 0
    is = [0] * length
    x = x0
    for i in range(n):
        at = (x + offset) * M
        if at < 0:
            at = 0
        if at >= s:
            at = s - 1
        if at == target:
            is[now] = x
            now += 1

        x ^= x << 13
        x ^= x >> 7
        x ^= x << 17

    is.sort()
    print(is[k - sum])

if __name__ == "__main__":
    solve()