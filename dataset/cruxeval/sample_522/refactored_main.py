numbers = range(100, 120)
floats = [n % 1 for n in numbers]
print(floats if 1 in floats else [])