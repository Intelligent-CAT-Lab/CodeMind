def p03781(x):
    i = 1
    while i * (i + 1) // 2 < x:
        i += 1
    return i

# Test case
x = 6
print(p03781(x))