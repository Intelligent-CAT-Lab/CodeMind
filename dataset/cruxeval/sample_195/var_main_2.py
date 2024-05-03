def f(text):
    for p in ['acs', 'asp', 'scn']:	## p = []
        text = text.removeprefix(p) + ' '	## text = [] | p = []
    return text.removeprefix(' ')[:-1]