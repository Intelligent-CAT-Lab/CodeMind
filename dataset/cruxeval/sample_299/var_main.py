def f(text, char):
    if not text.endswith(char):	## {"text" : '',"char" : ''}
        return f(char + text, char)
    return text	## {"text" : ''}
