def f(text, value):
    indexes = []	## <state>indexes = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i] == value and (i == 0 or text[i-1] != value):	## <state>text = CLRJ | i = CLRJ | value = CLRJ</state>
            indexes.append(i) 	## <state>indexes = CLRJ | i = CLRJ</state>
    if len(indexes) % 2 == 1:	## <state>indexes = CLRJ</state>
        return text
    return text[indexes[0]+1:indexes[-1]]	## <state>text = CLRJ | indexes = CLRJ</state>
