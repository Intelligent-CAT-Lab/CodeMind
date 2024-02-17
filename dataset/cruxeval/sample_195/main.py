def f(text):
    for p in ['acs', 'asp', 'scn']:
        text = text.removeprefix(p) + ' '
    return text.removeprefix(' ')[:-1]