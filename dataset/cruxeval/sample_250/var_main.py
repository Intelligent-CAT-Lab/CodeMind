def f(text):
    count = len(text)	## {"count" : '',"text" : ''}
    for i in range(-count+1, 0):	## {"i" : '',"count" : ''}
        text = text + text[i]	## {"text" : '',"i" : ''}
    return text	## {"text" : ''}
