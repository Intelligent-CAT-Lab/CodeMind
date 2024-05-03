def f(text):
    count = len(text)	## <state>count = CLRJ | text = CLRJ</state>
    for i in range(-count+1, 0):	## <state>i = CLRJ | count = CLRJ</state>
        text = text + text[i]	## <state>text = CLRJ | i = CLRJ</state>
    return text	## <state>text = CLRJ</state>
