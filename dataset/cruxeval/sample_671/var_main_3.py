def f(text, char1, char2):
    t1a = []	## <state>t1a = CLRJ</state>
    t2a = []	## <state>t2a = CLRJ</state>
    for i in range(len(char1)):	## <state>i = CLRJ | char1 = CLRJ</state>
        t1a.append(char1[i])	## <state>t1a = CLRJ | char1 = CLRJ | i = CLRJ</state>
        t2a.append(char2[i])	## <state>t2a = CLRJ | char2 = CLRJ | i = CLRJ</state>
    t1 = text.maketrans(dict(zip(t1a, t2a)))	## <state>t1 = CLRJ | text = CLRJ | t1a = CLRJ | t2a = CLRJ</state>
    return text.translate(t1)	## <state>text = CLRJ | t1 = CLRJ</state>
