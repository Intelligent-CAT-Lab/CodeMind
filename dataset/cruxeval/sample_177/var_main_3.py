def f(text):
    text = list(text)	## <state>text = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if i % 2 == 1:	## <state>i = CLRJ</state>
            text[i] = text[i].swapcase()	## <state>text = CLRJ | i = CLRJ</state>
    return ''.join(text)	## <state>text = CLRJ</state>
