numbers = [2.0, 49.9]
min_number = min(numbers)
max_number = max(numbers)
print([(x - min_number) / (max_number - min_number) for x in numbers])