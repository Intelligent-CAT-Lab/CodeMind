numbers = [1.0, 2.0, 3.0]
mean = sum(numbers) / len(numbers)
print(sum(abs(x - mean) for x in numbers) / len(numbers))