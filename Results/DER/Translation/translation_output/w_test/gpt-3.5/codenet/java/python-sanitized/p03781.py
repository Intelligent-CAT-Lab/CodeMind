def find_number(x):
    i = 1
    while i * (i + 1) / 2 < x:
        i += 1
    return i

x = int(input())
print(find_number(x))