def f(string):
    l = list(string)	## <state>l = CLRJ | string = CLRJ</state>
    for i in reversed(range(len(l))):	## <state>i = CLRJ | l = CLRJ</state>
        if l[i] != ' ':	## <state>l = CLRJ | i = CLRJ</state>
            break
        l.pop(i)	## <state>l = CLRJ | i = CLRJ</state>
    return ''.join(l)	## <state>l = CLRJ</state>
