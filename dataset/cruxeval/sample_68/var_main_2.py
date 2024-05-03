def f(text, pref):
    if text.startswith(pref):	## text = [] | pref = []
        n = len(pref)	## n = [] | pref = []
        text = '.'.join(text[n:].split('.')[1:] + text[:n].split('.')[:-1])	## text = [] | n = []
    return text	## text = []
