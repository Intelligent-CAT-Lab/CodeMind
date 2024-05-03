def f(text):
    text = list(text)	## {"text" : ''}
    for i in range(len(text)):	## {"i" : '',"text" : ''}
        if i % 2 == 1:	## {"i" : ''}
            text[i] = text[i].swapcase()	## {"text" : '',"i" : ''}
    return ''.join(text)	## {"text" : ''}
