num = 3
initial = [1]
total = initial
for _ in range(num):
    total = [1] + [x+y for x, y in zip(total, total[1:])]
    initial.append(total[-1])
print(sum(initial))