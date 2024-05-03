def f(text, prefix):
    while text.startswith(prefix):	## {"text" : '',"prefix" : ''}
        text = text[len(prefix):] or text	## {"text" : '',"prefix" : ''}
    return text	## {"text" : ''}
