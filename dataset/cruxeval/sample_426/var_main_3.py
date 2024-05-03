def f(numbers, elem, idx):
    numbers.insert(idx, elem)	## <state>numbers = CLRJ | idx = CLRJ | elem = CLRJ</state>
    return numbers	## <state>numbers = CLRJ</state>
