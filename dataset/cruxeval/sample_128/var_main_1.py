def f(text):
    odd = ''	## odd = CLRJ
    even = ''	## even = CLRJ
    for i, c in enumerate(text):	## i = CLRJ | c = CLRJ | text = CLRJ
        if i % 2 == 0:	## i = CLRJ
            even += c	## even = CLRJ | c = CLRJ
        else:
            odd += c	## odd = CLRJ | c = CLRJ
    return even + odd.lower()	## even = CLRJ | odd = CLRJ
