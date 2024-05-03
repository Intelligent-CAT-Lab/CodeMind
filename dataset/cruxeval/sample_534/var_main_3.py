def f(sequence, value):
    i = max(sequence.index(value) - len(sequence) // 3, 0)	## <state>i = CLRJ | sequence = CLRJ | value = CLRJ</state>
    result = ''	## <state>result = CLRJ</state>
    for j, v in enumerate(sequence[i:]):	## <state>j = CLRJ | v = CLRJ | sequence = CLRJ | i = CLRJ</state>
        if v == '+':	## <state>v = CLRJ</state>
            result += value
        else:
            result += sequence[i + j]	## <state>result = CLRJ | sequence = CLRJ | i = CLRJ | j = CLRJ</state>
    return result	## <state>result = CLRJ</state>
