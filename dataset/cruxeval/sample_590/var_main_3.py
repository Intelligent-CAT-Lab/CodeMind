def f(text):
    for i in range(10, 0, -1):	## <state>i = CLRJ</state>
        text = text.lstrip(str(i))	## <state>text = CLRJ | i = CLRJ</state>
    return text	## <state>text = CLRJ</state>
