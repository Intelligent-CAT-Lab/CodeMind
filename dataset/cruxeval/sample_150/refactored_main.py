numbers = [-2, 4, -4]
index = 0
for n in numbers[index:]:
    numbers.insert(index, n)
    index += 1
print(numbers[:index])