def f(text):
    t = text	## {"t" : '',"text" : ''}
    for i in text:	## {"i" : '',"text" : ''}
        text = text.replace(i, '')	## {"text" : '',"i" : ''}
    return str(len(text)) + t	## {"text" : '',"t" : ''}
