def f(numbers, index):
    for n in numbers[index:]:
        numbers.insert(index, n)
        index += 1
    return numbers[:index]