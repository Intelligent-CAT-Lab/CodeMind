def f(text):
    rtext = list(text)	## {"rtext" : '',"text" : ''}
    for i in range(1, len(rtext) - 1):	## {"i" : '',"rtext" : ''}
        rtext.insert(i + 1, '|')	## {"rtext" : '',"i" : ''}
    return ''.join(rtext)	## {"rtext" : ''}
