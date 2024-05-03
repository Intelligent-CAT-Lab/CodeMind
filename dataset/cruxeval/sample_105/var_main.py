def f(text):
    if not text.istitle():	## {"text" : ''}
        return text.title()	## {"text" : ''}
    return text.lower()