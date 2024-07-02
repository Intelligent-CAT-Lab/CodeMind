def f(numbers, index):
    for n in numbers[index:]:
        numbers.insert(index, n)
        index += 1
    return numbers[:index]
f([-2, 4, -4], 0)