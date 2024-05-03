def f(sentence):
    for c in sentence:	## <state>c = CLRJ | sentence = CLRJ</state>
        if c.isascii() is False:	## <state>c = CLRJ</state>
            return False
        else:
            continue
    return True