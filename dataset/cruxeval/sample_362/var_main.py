def f(text):
    for i in range(len(text)-1):	## {"i" : '',"text" : ''}
        if text[i:].islower():	## {"text" : '',"i" : ''}
            return text[i + 1:]	## {"text" : '',"i" : ''}
    return ''