def f(text, suffix):
    if suffix and suffix[-1] in text:	## suffix = [] | text = []
        return f(text.rstrip(suffix[-1]), suffix[:-1])	## text = [] | suffix = []
    else:
        return text	## text = []
