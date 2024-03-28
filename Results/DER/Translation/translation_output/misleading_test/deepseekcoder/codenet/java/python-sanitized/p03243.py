def p03243(n):
    for i in range(n, 1000):
        if i % 111 == 0:
            return i

# Test input
print(p03243(111))