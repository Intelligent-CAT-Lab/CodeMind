numbers = [1, 2, -8, -2, 0, -2]
unique_numbers = list(set(numbers))
unique_numbers.sort()
if len(unique_numbers) < 2:
  result = None
else:
  result = unique_numbers[1]

print(result)