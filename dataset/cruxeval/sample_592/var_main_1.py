def f(numbers):
    new_numbers = []	## new_numbers = CLRJ
    for i, _ in enumerate(numbers):	## i = CLRJ | _ = CLRJ | numbers = CLRJ
        new_numbers.append(numbers[len(numbers)-1-i])	## new_numbers = CLRJ | numbers = CLRJ | i = CLRJ
    return new_numbers	## new_numbers = CLRJ
