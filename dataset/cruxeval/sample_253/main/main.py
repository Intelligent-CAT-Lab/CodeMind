def f(text, pref):
    length = len(pref)
    if pref == text[:length]:
        return text[length:]
    return text