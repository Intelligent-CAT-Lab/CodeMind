def f(text, suffix):
    if suffix.startswith("/"):
        return text + suffix[1:]
    return text