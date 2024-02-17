def f(text, suffix):
    if suffix == '':
        suffix = None
    return text.endswith(suffix)