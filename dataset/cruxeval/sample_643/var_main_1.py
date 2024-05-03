def f(text, suffix):
    if text.endswith(suffix):	## text = CLRJ | suffix = CLRJ
        text = text[:-1] + text[-1:].swapcase()	## text = CLRJ
    return text	## text = CLRJ
