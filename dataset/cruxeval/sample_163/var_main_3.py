def f(text, space_symbol, size):
    spaces = ''.join(space_symbol for i in range(size-len(text)))	## <state>spaces = CLRJ | space_symbol = CLRJ | i = CLRJ | size = CLRJ | text = CLRJ</state>
    return text + spaces	## <state>text = CLRJ | spaces = CLRJ</state>
