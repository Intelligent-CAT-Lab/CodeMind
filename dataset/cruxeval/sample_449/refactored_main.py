x = '1'
n = len(x)
i = 0
while i < n and x[i].isdigit():
    i += 1
print(i == n)