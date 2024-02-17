x = int(input())
result = 0

if x <= 599:
    result = 8
elif x <= 799:
    result = 7
elif x <= 999:
    result = 6
elif x <= 1199:
    result = 5
elif x <= 1399:
    result = 4
elif x <= 1599:
    result = 3
elif x <= 1799:
    result = 2
else:
    result = 1

print(result)