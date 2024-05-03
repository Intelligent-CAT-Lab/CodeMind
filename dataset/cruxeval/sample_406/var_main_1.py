def f(text):
    ls = list(text)	## ls = CLRJ | text = CLRJ
    ls[0], ls[-1] = ls[-1].upper(), ls[0].upper()	## ls = CLRJ
    return ''.join(ls).istitle()	## ls = CLRJ
