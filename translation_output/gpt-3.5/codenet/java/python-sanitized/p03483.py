def bubbleCount(a, l, r):
    if r - l <= 1:
        return 0
    m = (l + r) // 2
    ret = bubbleCount(a, l, m) + bubbleCount(a, m, r)
    temp = a[l:r].copy()
    p0, p1, = 0, m - l
    p = l
    while p < r:
        if p0 == m - l:
            a[p] = temp[p1]
            p += 1
            p1 += 1
        elif p1 == r - l:
            a[p] = temp[p0]
            p += 1
            p0 += 1
        elif temp[p0] <= temp[p1]:
            a[p] = temp[p0]
            p += 1
            p0 += 1
        else:
            a[p] = temp[p1]
            p += 1
            p1 += 1
            ret += m - l - p0
    return ret

def solve():
    s = input()
    n = len(s)
    idx = [0] * 26

    for i in range(n):
        c = ord(s[i]) - ord('a')
        idx[c] += 1

    a = [[] for _ in range(26)]
    for i in range(26):
        a[i] = [0] * idx[i]

    map = [-1] * n
    ptr = [0] * 26
    now = 0
    oddUsed = -1

    for i in range(n):
        c = ord(s[i]) - ord('a')
        odd = idx[c] % 2 == 1

        if odd and oddUsed >= 0 and oddUsed != c:
            print(-1)
            return

        p = ptr[c]
        if p < idx[c] // 2:
            map[i] = now
            now += 1
        elif odd and p == idx[c] // 2:
            map[i] = n // 2
            oddUsed = c
        else:
            inv = idx[c] - p - 1
            map[i] = n - a[c][inv] - 1
        a[c][p] = map[i]
        ptr[c] += 1

    array = [0] * n
    for i in range(n):
        array[map[i]] = i

    x = bubbleCount(array, 0, n)
    print(x)

if __name__ == "__main__":
    solve()