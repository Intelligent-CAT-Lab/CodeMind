def f(text):
    text = list(text)	## {"text" : ''}
    for i in range(len(text)-1, -1, -1):	## {"i" : '',"text" : ''}
        if text[i].isspace():	## {"text" : '',"i" : ''}
            text[i] = '&nbsp;'	## {"text" : '',"i" : ''}
    return ''.join(text)	## {"text" : ''}
