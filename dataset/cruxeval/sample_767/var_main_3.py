def f(text):
    a = text.strip().split(' ')	## <state>a = CLRJ | text = CLRJ</state>
    for i in range(len(a)):	## <state>i = CLRJ | a = CLRJ</state>
        if a[i].isdigit() is False:	## <state>a = CLRJ | i = CLRJ</state>
            return '-'
    return " ".join(a)