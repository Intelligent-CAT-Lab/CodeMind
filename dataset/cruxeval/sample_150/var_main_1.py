def f(numbers, index):
    for n in numbers[index:]:	## n = CLRJ | numbers = CLRJ | index = CLRJ
        numbers.insert(index, n)	## numbers = CLRJ | index = CLRJ | n = CLRJ
        index += 1	## index = CLRJ
    return numbers[:index]	## numbers = CLRJ | index = CLRJ
