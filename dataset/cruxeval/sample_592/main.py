def f(numbers):
    new_numbers = []
    for i, _ in enumerate(numbers):
        new_numbers.append(numbers[len(numbers)-1-i])
    return new_numbers