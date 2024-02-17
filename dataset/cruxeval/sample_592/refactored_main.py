numbers = [11, 3]
new_numbers = []
for i, _ in enumerate(numbers):
    new_numbers.append(numbers[len(numbers)-1-i])
print(new_numbers)