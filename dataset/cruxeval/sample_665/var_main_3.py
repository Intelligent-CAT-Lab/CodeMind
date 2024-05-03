def f(chars):
    s = ""	## <state>s = CLRJ</state>
    for ch in chars:	## <state>ch = CLRJ | chars = CLRJ</state>
        if chars.count(ch) % 2 == 0:	## <state>chars = CLRJ | ch = CLRJ</state>
            s += ch.upper()	## <state>s = CLRJ | ch = CLRJ</state>
        else:
            s += ch	## <state>s = CLRJ | ch = CLRJ</state>
    return s	## <state>s = CLRJ</state>
