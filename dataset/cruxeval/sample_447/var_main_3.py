def f(text, tab_size):
    res = ''	## <state>res = CLRJ</state>
    text = text.replace('\t', ' '*(tab_size-1))	## <state>text = CLRJ | tab_size = CLRJ</state>
    for i in range(len(text)):	## <state>i = CLRJ | text = CLRJ</state>
        if text[i] == ' ':	## <state>text = CLRJ | i = CLRJ</state>
            res += '|'	## <state>res = CLRJ</state>
        else:
            res += text[i]	## <state>res = CLRJ | text = CLRJ | i = CLRJ</state>
    return res	## <state>res = CLRJ</state>
