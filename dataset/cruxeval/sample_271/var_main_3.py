def f(text, c):
    ls = list(text)	## <state>ls = CLRJ | text = CLRJ</state>
    if c not in text:	## <state>c = CLRJ | text = CLRJ</state>
        raise ValueError('Text has no {c}')
    ls.pop(text.rindex(c))	## <state>ls = CLRJ | text = CLRJ | c = CLRJ</state>
    return ''.join(ls)	## <state>ls = CLRJ</state>
