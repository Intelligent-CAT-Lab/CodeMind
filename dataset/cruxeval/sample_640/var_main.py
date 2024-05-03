def f(text):
    a = 0	## {"a" : ''}
    if text[0] in text[1:]:	## {"text" : ''}
        a += 1	## {"a" : ''}
    for i in range(0, len(text)-1):	## {"i" : '',"text" : ''}
        if text[i] in text[i+1:]:	## {"text" : '',"i" : ''}
            a += 1	## {"a" : ''}
    return a	## {"a" : ''}
