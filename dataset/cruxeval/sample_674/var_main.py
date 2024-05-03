def f(text):
    ls = list(text)	## {"ls" : '',"text" : ''}
    for x in range(len(ls)-1, -1, -1):	## {"x" : '',"ls" : ''}
        if len(ls) <= 1: break	## {"ls" : ''}
        if ls[x] not in 'zyxwvutsrqponmlkjihgfedcba': ls.pop(ls[x])	## {"ls" : '',"x" : ''}
    return ''.join(ls)	## {"ls" : ''}
