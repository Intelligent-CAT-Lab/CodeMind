def f(sentence):
    ls = list(sentence)	## ls = CLRJ | sentence = CLRJ
    for letter in ls:	## letter = CLRJ | ls = CLRJ
        if not letter.istitle():	## letter = CLRJ
            ls.remove(letter)	## ls = CLRJ | letter = CLRJ
    return ''.join(ls)	## ls = CLRJ
