def f(text, suffix):
    if suffix and suffix[-1] in text:
        return f(text.rstrip(suffix[-1]), suffix[:-1])
    else:
        return text