def f(text):
    a = text.split('\n')	## <state>a = CLRJ | text = CLRJ</state>
    b = []	## <state>b = CLRJ</state>
    for i in range(len(a)):	## <state>i = CLRJ | a = CLRJ</state>
        c = a[i].replace('\t', '    ')	## <state>c = CLRJ | a = CLRJ | i = CLRJ</state>
        b.append(c)	## <state>b = CLRJ | c = CLRJ</state>
    return '\n'.join(b)	## <state>b = CLRJ</state>
