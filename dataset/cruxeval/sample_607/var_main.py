def f(text):
    for i in ['.', '!', '?']:	## {"i" : ''}
        if text.endswith(i):	## {"text" : '',"i" : ''}
            return True
    return False