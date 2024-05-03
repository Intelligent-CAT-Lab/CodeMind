def f(prefix, text):
    if text.startswith(prefix):	## text = [] | prefix = []
        return text
    else:
        return prefix + text	## prefix = [] | text = []
