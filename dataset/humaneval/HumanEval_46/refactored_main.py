n = 5 
results = [0, 0, 2, 0]
if n < 4:
    print(results[n])
else:
    for _ in range(4, n + 1):
        results.append(results[-1] + results[-2] + results[-3] + results[-4])
        results.pop(0)

    print(results[-1])