def f(text, count):
    for i in range(count):	## <state>i = CLRJ | count = CLRJ</state>
        text = text[::-1]	## <state>text = CLRJ</state>
    return text	## <state>text = CLRJ</state>
