def f(text, suffix):
    if suffix and text and text.endswith(suffix):	## suffix = CLRJ | text = CLRJ
        return text.removesuffix(suffix)
    else:
        return text	## text = CLRJ
