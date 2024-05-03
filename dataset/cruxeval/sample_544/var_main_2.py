def f(text):
    a = text.split('\n')	## a = [] | text = []
    b = []	## b = []
    for i in range(len(a)):	## i = [] | a = []
        c = a[i].replace('\t', '    ')	## c = [] | a = [] | i = []
        b.append(c)	## b = [] | c = []
    return '\n'.join(b)	## b = []
