def f(text):
    l = text.rpartition('0')	## <state>l = CLRJ | text = CLRJ</state>
    if l[2] == '':	## <state>l = CLRJ</state>
        return '-1:-1'
    return f'{len(l[0])}:{l[2].find("0") + 1}'	## <state>l = CLRJ</state>
