def f(text):
    ls = list(text)	## {"ls" : '',"text" : ''}
    length = len(ls)	## {"length" : '',"ls" : ''}
    for i in range(length):	## {"i" : '',"length" : ''}
        ls.insert(i, ls[i])	## {"ls" : '',"i" : ''}
    return ''.join(ls).ljust(length * 2)	## {"ls" : '',"length" : ''}
