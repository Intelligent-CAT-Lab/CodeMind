def p03480(s):
    s += '2'
    n = len(s)
    ans = n - 1
    for i in range(n - 1):
        if s[i] != s[i + 1]:
            tmp = max(i + 1, n - i - 2)
            ans = min(ans, tmp)
    return ans

# Test case
input_str = input()  # Test input: "010"
print(p03480(input_str))  # Expected output: 2