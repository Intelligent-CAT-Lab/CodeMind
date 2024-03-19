def p03999():
    s = input()
    ans = 0
    for dx in range(len(s)+1):
        for start in range(len(s)-dx):
            cur = int(s[start:start+dx])
            ans += cur * (helper(start) * helper(len(s)-1-dx-start))
    print(ans)

def helper(n):
    if n == 0:
        return 1
    return 1 << (n-1)

p03999()