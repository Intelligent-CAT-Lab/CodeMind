def min_consecutive_chars(s):
    ans = 101
    for i in range(26):
        target = chr(i + ord('a'))
        max_val = 0
        cur = 0
        for j in range(len(s)):
            if s[j] == target:
                cur = 0
            else:
                cur += 1
                max_val = max(max_val, cur)
        ans = min(ans, max_val)
    return ans

# Test input
s = "serval"
print(min_consecutive_chars(s))  # Expected output: 3