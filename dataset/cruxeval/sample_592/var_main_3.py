def f(numbers):
    new_numbers = []	## <state>new_numbers = CLRJ</state>
    for i, _ in enumerate(numbers):	## <state>i = CLRJ | _ = CLRJ | numbers = CLRJ</state>
        new_numbers.append(numbers[len(numbers)-1-i])	## <state>new_numbers = CLRJ | numbers = CLRJ | i = CLRJ</state>
    return new_numbers	## <state>new_numbers = CLRJ</state>
