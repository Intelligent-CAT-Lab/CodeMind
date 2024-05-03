def f(text):
    a = text.split('\n')	## a = CLRJ | text = CLRJ
    b = []	## b = CLRJ
    for i in range(len(a)):	## i = CLRJ | a = CLRJ
        c = a[i].replace('\t', '    ')	## c = CLRJ | a = CLRJ | i = CLRJ
        b.append(c)	## b = CLRJ | c = CLRJ
    return '\n'.join(b)	## b = CLRJ
