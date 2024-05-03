def f(sequence, value):
    i = max(sequence.index(value) - len(sequence) // 3, 0)	## i = CLRJ | sequence = CLRJ | value = CLRJ
    result = ''	## result = CLRJ
    for j, v in enumerate(sequence[i:]):	## j = CLRJ | v = CLRJ | sequence = CLRJ | i = CLRJ
        if v == '+':	## v = CLRJ
            result += value
        else:
            result += sequence[i + j]	## result = CLRJ | sequence = CLRJ | i = CLRJ | j = CLRJ
    return result	## result = CLRJ
