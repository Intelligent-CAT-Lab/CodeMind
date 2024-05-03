def f(text):
    for c in text:	## {"c" : '',"text" : ''}
        if c.isdigit():	## {"c" : ''}
            if c == '0':	## {"c" : ''}
                c = '.'
            else:
                c = '0' if c != '1' else '.'	## {"c" : ''}
    return ''.join(list(text)).replace('.', '0')	## {"text" : ''}
