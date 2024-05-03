def f(text, prefix):
    if text.startswith(prefix):	## text = CLRJ | prefix = CLRJ
        return text.removeprefix(prefix)
    if prefix in text:	## prefix = CLRJ | text = CLRJ
        return text.replace(prefix, '').strip()
    return text.upper()	## text = CLRJ
