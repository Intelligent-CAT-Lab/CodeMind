def f(text):
    result = ''	## {"result" : ''}
    i = len(text)-1	## {"i" : '',"text" : ''}
    while i >= 0:	## {"i" : ''}
        c = text[i]	## {"c" : '',"text" : '',"i" : ''}
        if c.isalpha():	## {"c" : ''}
            result += c	## {"result" : '',"c" : ''}
        i -= 1	## {"i" : ''}
    return result	## {"result" : ''}
