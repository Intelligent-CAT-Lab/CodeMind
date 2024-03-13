def solve():
    s = list(input())
    n = len(s)
    idx = [0]*26
    
    for i in range(n):
        c = ord(s[i]) - ord('a')
        idx[c] += 1
    
    a = [[] for _ in range(26)]
    for i in range(26):
        a[i] = [0]*idx[i]

    map = [-1]*n
    oddUsed = -1
    now = 0
    ptr = [0]*26
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
    
    array = [0]*n
    for i in range(n):
        array[map[i]] = i
    
    x = bubbleCount(array, 0, n)
    print(x)

def bubbleCount(a, l, r):
    if r - l <= 1:
        return 0
    m = (l+r)//2
    ret = bubbleCount(a, l, m) + bubbleCount(a, m