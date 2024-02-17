numbers = [3,2,3,100,3]
running_max = None
result = []

for n in numbers:
    if running_max is None:
        running_max = n
    else:
        running_max = max(running_max, n)

    result.append(running_max)

print(result)