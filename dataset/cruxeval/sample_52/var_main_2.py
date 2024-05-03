def f(text):
    a = []	## a = []
    for i in range(len(text)):	## i = [] | text = []
        if not text[i].isdecimal():	## text = [] | i = []
            a.append(text[i])	## a = [] | text = [] | i = []
    return ''.join(a)	## a = []
