def f(sentence):
    ls = list(sentence)	## {"ls" : '',"sentence" : ''}
    for letter in ls:	## {"letter" : '',"ls" : ''}
        if not letter.istitle():	## {"letter" : ''}
            ls.remove(letter)	## {"ls" : '',"letter" : ''}
    return ''.join(ls)	## {"ls" : ''}
