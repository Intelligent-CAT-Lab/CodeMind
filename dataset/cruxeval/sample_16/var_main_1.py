def f(text, suffix):
    if text.endswith(suffix):	## text = CLRJ | suffix = CLRJ
        return text[:-len(suffix)]
    return text	## text = CLRJ
