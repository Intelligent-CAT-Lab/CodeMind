def f(text):
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if not char.isspace():	## <state>char = CLRJ</state>
            return False
    return True