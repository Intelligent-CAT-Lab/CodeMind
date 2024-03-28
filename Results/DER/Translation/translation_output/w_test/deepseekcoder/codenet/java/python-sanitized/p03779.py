def p03779(x):
    ans = 0
    i = 0
    while i < 100000:
        if x <= i * (i + 1) // 2:
            ans = i
            break
        i += 1
    return ans

# Test input
x = 6

# Call the function with the test input
print(p03779(x))