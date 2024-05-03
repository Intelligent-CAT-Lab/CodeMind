def f(text):
    ls = list(text)	## {"ls" : '',"text" : ''}
    total = (len(text) - 1) * 2	## {"total" : '',"text" : ''}
    for i in range(1, total+1):	## {"i" : '',"total" : ''}
        if i % 2:	## {"i" : ''}
            ls.append('+')	## {"ls" : ''}
        else:
            ls.insert(0, '+')	## {"ls" : ''}
    return ''.join(ls).rjust(total)	## {"ls" : '',"total" : ''}
