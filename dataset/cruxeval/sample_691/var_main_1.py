def f(text, suffix):
    if suffix and suffix[-1] in text:	## suffix = CLRJ | text = CLRJ
        return f(text.rstrip(suffix[-1]), suffix[:-1])	## text = CLRJ | suffix = CLRJ
    else:
        return text	## text = CLRJ
