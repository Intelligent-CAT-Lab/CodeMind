def p01722(n):
    if n == 0:
        return 1
    elif n == 1:
        return 2
    elif n == 2:
        return 1
    else:
        return 0

n = int(input())
print(p01722(n))