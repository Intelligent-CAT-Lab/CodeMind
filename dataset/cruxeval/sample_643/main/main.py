def f(text, suffix):
    if text.endswith(suffix):
        text = text[:-1] + text[-1:].swapcase()
    return text