def f(text, char):
    length = len(text)	## <state>length = CLRJ | text = CLRJ</state>
    index = -1	## <state>index = CLRJ</state>
    for i in range(length):	## <state>i = CLRJ | length = CLRJ</state>
        if text[i] == char:	## <state>text = CLRJ | i = CLRJ | char = CLRJ</state>
            index = i	## <state>index = CLRJ | i = CLRJ</state>
    if index == -1:	## <state>index = CLRJ</state>
        index = length // 2
    new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
    new_text.pop(index)	## <state>new_text = CLRJ | index = CLRJ</state>
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
