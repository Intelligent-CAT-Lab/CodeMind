def count_set_bits(n):
    s = ""

    while n > 0:
        x = n % 2
        n //= 2
        s += str(x) + " "

    ans = 0

    for i in range(len(s)):
        if s[i] == '1':
            ans += 1

    return ans

# Test input
n = 9

# Expected output
print(count_set_bits(n))