def f(sentence):
    for c in sentence:	## c = CLRJ | sentence = CLRJ
        if c.isascii() is False:	## c = CLRJ
            return False
        else:
            continue
    return True