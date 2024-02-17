def f(text, value):
    if isinstance(value, str):
        return text.count(value) + text.count(value.lower())
    return text.count(value)