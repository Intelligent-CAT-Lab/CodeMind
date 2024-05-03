def f(text, suffix):
    if suffix and text.endswith(suffix):	## suffix = CLRJ | text = CLRJ
        return text[:- len(suffix)]
    return text	## text = CLRJ
