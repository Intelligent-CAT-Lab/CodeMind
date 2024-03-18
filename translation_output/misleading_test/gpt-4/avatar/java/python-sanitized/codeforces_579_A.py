def codeforces_579_A(n):
    s = " "
    while n > 0:
        x = n % 2
        n //= 2
        s += f"{x} "
    
    ans = 0
    
    for char in s:
        if char == '1':
            ans += 1
            
    return ans


# Test input
n = 9

# Expected output: 48
print(codeforces_579_A(n))