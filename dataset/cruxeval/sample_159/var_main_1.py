def f(st):
    swapped = ''	## swapped = CLRJ
    for ch in reversed(st):	## ch = CLRJ | st = CLRJ
        swapped += ch.swapcase()	## swapped = CLRJ | ch = CLRJ
    return swapped	## swapped = CLRJ
