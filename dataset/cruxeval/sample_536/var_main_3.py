def f(cat):
    digits = 0	## <state>digits = CLRJ</state>
    for char in cat:	## <state>char = CLRJ | cat = CLRJ</state>
        if char.isdigit():	## <state>char = CLRJ</state>
            digits += 1	## <state>digits = CLRJ</state>
    return digits	## <state>digits = CLRJ</state>
