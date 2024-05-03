def f(text, suffix):
    if suffix == '':	## suffix = []
        suffix = None
    return text.endswith(suffix)	## text = [] | suffix = []
