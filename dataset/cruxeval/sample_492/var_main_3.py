def f(text, value):
    ls = list(text)	## <state>ls = CLRJ | text = CLRJ</state>
    if (ls.count(value)) % 2 == 0:	## <state>ls = CLRJ | value = CLRJ</state>
        while value in ls:	## <state>value = CLRJ | ls = CLRJ</state>
            ls.remove(value)
    else:
        ls.clear()
    return ''.join(ls)	## <state>ls = CLRJ</state>
