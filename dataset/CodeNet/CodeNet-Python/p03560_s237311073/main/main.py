from collections import deque


def calc(k):
    if k == 1:
        return 1
    d = {1: 1}
    q = deque([[1, 1]])
    while q:
        n, c = q.popleft()
        a = (n * 10) % k
        if a not in d or c < d[a]:
            d[a] = c
            q.appendleft([a, c])
        b = (n + 1) % k
        if b not in d or c + 1 < d[b]:
            d[b] = c + 1
            q.append([b, c + 1])
    return d[0]


print((calc(int(eval(input())))))