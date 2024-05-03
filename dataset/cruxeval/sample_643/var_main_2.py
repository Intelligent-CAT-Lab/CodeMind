def f(text, suffix):
    if text.endswith(suffix):	## text = [] | suffix = []
        text = text[:-1] + text[-1:].swapcase()	## text = []
    return text	## text = []
