def f(sentence):
    ls = list(sentence)	## <state>ls = CLRJ | sentence = CLRJ</state>
    for letter in ls:	## <state>letter = CLRJ | ls = CLRJ</state>
        if not letter.istitle():	## <state>letter = CLRJ</state>
            ls.remove(letter)	## <state>ls = CLRJ | letter = CLRJ</state>
    return ''.join(ls)	## <state>ls = CLRJ</state>
