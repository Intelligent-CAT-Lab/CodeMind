def f(text, c):
    ls = list(text)	## ls = CLRJ | text = CLRJ
    if c not in text:	## c = CLRJ | text = CLRJ
        raise ValueError('Text has no {c}')
    ls.pop(text.rindex(c))	## ls = CLRJ | text = CLRJ | c = CLRJ
    return ''.join(ls)	## ls = CLRJ
