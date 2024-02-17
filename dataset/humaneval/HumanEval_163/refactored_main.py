a = 2
b = 10
lower = max(2, min(a, b))
upper = min(8, max(a, b))

print([i for i in range(lower, upper+1) if i % 2 == 0])