def f(text):
    count = text.count(text[0])	## count = CLRJ | text = CLRJ
    ls = list(text)	## ls = CLRJ | text = CLRJ
    for _ in range(count):	## _ = CLRJ | count = CLRJ
        ls.remove(ls[0])	## ls = CLRJ
    return ''.join(ls)	## ls = CLRJ
