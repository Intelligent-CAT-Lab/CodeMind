a = 2
b = 3
n = 7
i = 0
while i * a <= n:
    if (n - (i * a)) % b == 0: 
        solution = (i, (n - (i * a)) // b)
        break
    i = i + 1
solution = None
print(solution)