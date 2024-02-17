def f(text, pref):
    if isinstance(pref, list):
        return ', '.join(text.startswith(x) for x in pref)
    else:
        return text.startswith(pref)