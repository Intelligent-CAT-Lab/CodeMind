def f(text, suffix):
    if suffix and text.endswith(suffix):
        return text[:- len(suffix)]
    return text