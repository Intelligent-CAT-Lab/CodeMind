def f(numbers):
    for i in range(len(numbers)):	## <state>i = CLRJ | numbers = CLRJ</state>
        if numbers.count('3') > 1:	## <state>numbers = CLRJ</state>
            return i
    return -1