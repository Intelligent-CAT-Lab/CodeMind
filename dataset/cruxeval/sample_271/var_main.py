def f(text, c):
    ls = list(text)	## {"ls" : '',"text" : ''}
    if c not in text:	## {"c" : '',"text" : ''}
        raise ValueError('Text has no {c}')
    ls.pop(text.rindex(c))	## {"ls" : '',"text" : '',"c" : ''}
    return ''.join(ls)	## {"ls" : ''}
