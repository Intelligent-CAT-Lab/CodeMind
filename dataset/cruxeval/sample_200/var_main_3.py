def f(text, value):
    length = len(text)	## <state>length = CLRJ | text = CLRJ</state>
    index = 0	## <state>index = CLRJ</state>
    while length > 0:	## <state>length = CLRJ</state>
        value = text[index] + value	## <state>value = CLRJ | text = CLRJ | index = CLRJ</state>
        length -= 1	## <state>length = CLRJ</state>
        index += 1	## <state>index = CLRJ</state>
    return value	## <state>value = CLRJ</state>
