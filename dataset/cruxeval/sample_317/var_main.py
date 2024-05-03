def f(text, a, b):
    text = text.replace(a, b)	## {"text" : '',"a" : '',"b" : ''}
    return text.replace(b, a)	## {"text" : '',"b" : '',"a" : ''}
