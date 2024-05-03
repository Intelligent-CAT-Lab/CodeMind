def f(text):
    ls = list(text)	## <state>ls = CLRJ | text = CLRJ</state>
    total = (len(text) - 1) * 2	## <state>total = CLRJ | text = CLRJ</state>
    for i in range(1, total+1):	## <state>i = CLRJ | total = CLRJ</state>
        if i % 2:	## <state>i = CLRJ</state>
            ls.append('+')	## <state>ls = CLRJ</state>
        else:
            ls.insert(0, '+')	## <state>ls = CLRJ</state>
    return ''.join(ls).rjust(total)	## <state>ls = CLRJ | total = CLRJ</state>
