def f(numbers):
    floats = [n % 1 for n in numbers]
    return floats if 1 in floats else []
f(range(100, 120))