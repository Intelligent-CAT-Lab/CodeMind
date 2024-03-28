def solve(s):
    s = "$" + s + "$"
    ans = 0
    s = 0
    for i in range(1, len(s)):
        if s[i] == 'O' and s[i - 1] != 'O': 
            s = i
        if s[i] == 'O' and s[i + 1] != 'O': 
            l = i - s + 1
            if s >= l and len(s) - i - 1 >= l:
                ok = True
                for j in range(l):
                    if s[s - 1 - j] != 'J' or s[i + 1 + j] != 'I':
                        ok = False
                        break
                if ok: 
                    ans = max(ans, l)
    return ans

print(solve(input()))