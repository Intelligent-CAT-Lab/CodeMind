def f(length, text):
    if len(text) == length:	## <state>text = CLRJ | length = CLRJ</state>
        return text[::-1]
    return False