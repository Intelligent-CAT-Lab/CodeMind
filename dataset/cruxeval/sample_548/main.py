def f(text, suffix):
    if suffix and text and text.endswith(suffix):
        return text.removesuffix(suffix)
    else:
        return text