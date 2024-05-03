def f(text, x):
    if text.removeprefix(x) == text:	## {"text" : '',"x" : ''}
        return f(text[1:], x)
    else:
        return text