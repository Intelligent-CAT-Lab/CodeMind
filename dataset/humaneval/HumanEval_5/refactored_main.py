numbers = []
delimeter = 7
if not numbers:
    result = []

result = []

for n in numbers[:-1]:
    result.append(n)
    result.append(delimeter)

result.append(numbers[-1]) if numbers else None
print(result)