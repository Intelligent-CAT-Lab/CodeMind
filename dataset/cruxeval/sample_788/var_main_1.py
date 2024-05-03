def f(text, suffix):
    if suffix.startswith("/"):	## suffix = CLRJ
        return text + suffix[1:]	## text = CLRJ | suffix = CLRJ
    return text