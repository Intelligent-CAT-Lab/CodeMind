def f(text, suffix):
    if suffix == '':	## suffix = CLRJ
        suffix = None
    return text.endswith(suffix)	## text = CLRJ | suffix = CLRJ
