def f(numbers):
    for i in range(len(numbers)):
        if numbers.count('3') > 1:
            return i
    return -1