def f(numbers):
    for i in range(len(numbers)):	## i = CLRJ | numbers = CLRJ
        if numbers.count('3') > 1:	## numbers = CLRJ
            return i
    return -1