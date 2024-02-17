def f(prefix, text):
    if text.startswith(prefix):
        return text
    else:
        return prefix + text