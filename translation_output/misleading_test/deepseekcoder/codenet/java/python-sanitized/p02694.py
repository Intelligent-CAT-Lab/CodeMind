def p02694(x):
    count = 0
    a = 100
    while True:
        if a >= x:
            break
        a = a + a//100
        count += 1
    return count

x = int(input())
print(p02694(x))