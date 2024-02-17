numbers = []
num = 0
val = 1
while len(numbers) < num:
    numbers.insert(len(numbers) // 2, val)
for _ in range(len(numbers) // (num - 1) - 4):
    numbers.insert(len(numbers) // 2, val)
print(' '.join(numbers))