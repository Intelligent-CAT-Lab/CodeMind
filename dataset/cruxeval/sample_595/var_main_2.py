def f(text, prefix):
    if text.startswith(prefix):	## text = [] | prefix = []
        text = text.removeprefix(prefix)
    text = text.capitalize()	## text = []
    return text	## text = []
