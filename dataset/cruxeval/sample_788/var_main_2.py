def f(text, suffix):
    if suffix.startswith("/"):	## suffix = []
        return text + suffix[1:]	## text = [] | suffix = []
    return text