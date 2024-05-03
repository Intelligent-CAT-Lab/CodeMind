def f(text, char1, char2):
    t1a = []	## t1a = CLRJ
    t2a = []	## t2a = CLRJ
    for i in range(len(char1)):	## i = CLRJ | char1 = CLRJ
        t1a.append(char1[i])	## t1a = CLRJ | char1 = CLRJ | i = CLRJ
        t2a.append(char2[i])	## t2a = CLRJ | char2 = CLRJ | i = CLRJ
    t1 = text.maketrans(dict(zip(t1a, t2a)))	## t1 = CLRJ | text = CLRJ | t1a = CLRJ | t2a = CLRJ
    return text.translate(t1)	## text = CLRJ | t1 = CLRJ
