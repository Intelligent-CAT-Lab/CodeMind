n = int(input())
a = [0] * 15
i = 0
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1
while i > 0:
    i -= 1
    if a[i] == 0:
        print("0", end="")
    elif a[i] > 0:
        print("+", end="")
    else:
        print("-", end="")
    if i == 0:
        print()