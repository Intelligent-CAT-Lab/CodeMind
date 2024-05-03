def f(text):
    chars = []	## {"chars" : ''}
    for c in text:	## {"c" : '',"text" : ''}
        if c.isdigit():	## {"c" : ''}
            chars.append(c)	## {"chars" : '',"c" : ''}
    return ''.join(chars[::-1])	## {"chars" : ''}
