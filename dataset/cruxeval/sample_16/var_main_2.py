def f(text, suffix):
    if text.endswith(suffix):	## text = [] | suffix = []
        return text[:-len(suffix)]
    return text	## text = []
