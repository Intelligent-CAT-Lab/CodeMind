def p02880(N):
    f = False
    for A in range(1, 10):
        if N % A == 0 and N // A < 10:
            f = True
    return "Yes" if f else "No"

print(p02880(10))