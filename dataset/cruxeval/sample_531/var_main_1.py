def f(text, x):
    if text.removeprefix(x) == text:	## text = CLRJ | x = CLRJ
        return f(text[1:], x)
    else:
        return text