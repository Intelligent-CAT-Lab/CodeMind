def f(text, pre):
    if not text.startswith(pre):	## text = [] | pre = []
        return text
    return text.removeprefix(pre)	## text = [] | pre = []
