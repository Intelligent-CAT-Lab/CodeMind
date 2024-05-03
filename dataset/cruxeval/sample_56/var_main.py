def f(sentence):
    for c in sentence:	## {"c" : '',"sentence" : ''}
        if c.isascii() is False:	## {"c" : ''}
            return False
        else:
            continue
    return True