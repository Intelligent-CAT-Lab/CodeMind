def f(numbers, num, val):
    while len(numbers) < num:	## <state>numbers = CLRJ | num = CLRJ</state>
        numbers.insert(len(numbers) // 2, val)
    for _ in range(len(numbers) // (num - 1) - 4):	## <state>numbers = CLRJ | num = CLRJ</state>
        numbers.insert(len(numbers) // 2, val)
    return ' '.join(numbers)	## <state>numbers = CLRJ</state>
