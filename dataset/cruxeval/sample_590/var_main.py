def f(text):
    for i in range(10, 0, -1):	## {"i" : ''}
        text = text.lstrip(str(i))	## {"text" : '',"i" : ''}
    return text	## {"text" : ''}
