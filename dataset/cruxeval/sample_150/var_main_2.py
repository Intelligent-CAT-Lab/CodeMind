def f(numbers, index):
    for n in numbers[index:]:	## n = [] | numbers = [] | index = []
        numbers.insert(index, n)	## numbers = [] | index = [] | n = []
        index += 1	## index = []
    return numbers[:index]	## numbers = [] | index = []
