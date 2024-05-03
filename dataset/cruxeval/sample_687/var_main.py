def f(text):
    t = list(text)	## {"t" : '',"text" : ''}
    t.pop(len(t) // 2)	## {"t" : ''}
    t.append(text.lower())	## {"t" : '',"text" : ''}
    return ':'.join([c for c in t])	## {"c" : '',"t" : ''}
