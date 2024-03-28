def p01447(n):
    count = 0
    while n > 1:
        n = (n + (0 if n % 3 == 0 else 3 - n % 3)) // 3
        count += 1
    return count

n = int(input())
print(p01447(n))