def f(text):
    for i in ['.', '!', '?']:	## <state>i = CLRJ</state>
        if text.endswith(i):	## <state>text = CLRJ | i = CLRJ</state>
            return True
    return False