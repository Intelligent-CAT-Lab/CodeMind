def f(text):
    s = text.rpartition('o')	## <state>s = CLRJ | text = CLRJ</state>
    div, div2 = (s[0] == '' and '-' or s[0]), (s[2] == '' and '-' or s[2])	## <state>div = CLRJ | div2 = CLRJ | s = CLRJ</state>
    return s[1] + div + s[1] + div2	## <state>s = CLRJ | div = CLRJ | div2 = CLRJ</state>
