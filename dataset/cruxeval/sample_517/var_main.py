def f(text):
    for i in range(len(text)-1, 0, -1):	## {"i" : '',"text" : ''}
        if not text[i].isupper():	## {"text" : '',"i" : ''}
            return text[0:i]	## {"text" : '',"i" : ''}
    return ''