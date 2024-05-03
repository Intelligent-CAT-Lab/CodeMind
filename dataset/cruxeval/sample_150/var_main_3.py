def f(numbers, index):
    for n in numbers[index:]:	## <state>n = CLRJ | numbers = CLRJ | index = CLRJ</state>
        numbers.insert(index, n)	## <state>numbers = CLRJ | index = CLRJ | n = CLRJ</state>
        index += 1	## <state>index = CLRJ</state>
    return numbers[:index]	## <state>numbers = CLRJ | index = CLRJ</state>
