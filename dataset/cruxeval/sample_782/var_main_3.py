def f(input):
    for char in input:	## <state>char = CLRJ | input = CLRJ</state>
        if char.isupper():	## <state>char = CLRJ</state>
            return False
    return True