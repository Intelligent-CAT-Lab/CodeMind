def f(text, suffix):
    if text.endswith(suffix):
        return text[:-len(suffix)]
    return text