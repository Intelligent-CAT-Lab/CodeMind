def second_smallest(numbers):
  unique_numbers = list(set(numbers))
  unique_numbers.sort()
  if len(unique_numbers) < 2:
    return None
  else:
    return unique_numbers[1]
second_smallest([1, 2, -8, -2, 0, -2])