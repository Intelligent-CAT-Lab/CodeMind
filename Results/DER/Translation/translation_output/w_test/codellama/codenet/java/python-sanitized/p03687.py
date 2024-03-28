import math

def solve(s):
    ans = 101
    for i in range(26):
        target = chr(i + ord('a'))
        max_val = 0
        cur_val = 0
        for j in range(len(s)):
            if s[j] == target:
                cur_val = 0
            else:
                cur_val += 1
                max_val = max(max_val, cur_val)
        ans = min(ans, max_val)
    return ans

s = "serval"
print(solve(s))