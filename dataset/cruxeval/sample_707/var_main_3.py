def f(text, position):
    length = len(text)	## <state>length = CLRJ | text = CLRJ</state>
    index = position % (length + 1)	## <state>index = CLRJ | position = CLRJ | length = CLRJ</state>
    if position < 0 or index < 0:	## <state>position = CLRJ | index = CLRJ</state>
        index = -1
    new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
    new_text.pop(index)	## <state>new_text = CLRJ | index = CLRJ</state>
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
