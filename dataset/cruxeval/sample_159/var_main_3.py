def f(st):
    swapped = ''	## <state>swapped = CLRJ</state>
    for ch in reversed(st):	## <state>ch = CLRJ | st = CLRJ</state>
        swapped += ch.swapcase()	## <state>swapped = CLRJ | ch = CLRJ</state>
    return swapped	## <state>swapped = CLRJ</state>
