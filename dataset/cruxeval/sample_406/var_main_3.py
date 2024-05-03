def f(text):
    ls = list(text)	## <state>ls = CLRJ | text = CLRJ</state>
    ls[0], ls[-1] = ls[-1].upper(), ls[0].upper()	## <state>ls = CLRJ</state>
    return ''.join(ls).istitle()	## <state>ls = CLRJ</state>
