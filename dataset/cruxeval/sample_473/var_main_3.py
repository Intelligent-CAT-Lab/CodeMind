def f(text, value):
    indexes = list()	## <state>indexes = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i] == value:	## <state>text = CLRJ | i = CLRJ | value = CLRJ</state>
            indexes.append(i)	## <state>indexes = CLRJ | i = CLRJ</state>
    new_text = list(text)	## <state>new_text = CLRJ | text = CLRJ</state>
    for i in indexes:	## <state>i = CLRJ | indexes = CLRJ</state>
        new_text.remove(value)	## <state>new_text = CLRJ | value = CLRJ</state>
    return ''.join(new_text)	## <state>new_text = CLRJ</state>
