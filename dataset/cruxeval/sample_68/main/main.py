def f(text, pref):
    if text.startswith(pref):
        n = len(pref)
        text = '.'.join(text[n:].split('.')[1:] + text[:n].split('.')[:-1])
    return text