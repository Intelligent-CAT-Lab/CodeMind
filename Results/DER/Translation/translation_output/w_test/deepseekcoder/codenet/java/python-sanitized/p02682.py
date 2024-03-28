def p02682():
    a, b, c, d = map(int, input().split())
    sum = 0
    if d <= a:
        return d
    sum = a
    d -= a
    if d <= b:
        return sum
    d -= b
    sum -= d
    return sum

print(p02682())