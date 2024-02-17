n = "6 ** 2"
for i in str(n):
    if not i.isdigit():
        n = -1
        break
print(n)