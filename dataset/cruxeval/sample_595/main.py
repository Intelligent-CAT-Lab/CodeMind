def f(text, prefix):
    if text.startswith(prefix):
        text = text.removeprefix(prefix)
    text = text.capitalize()
    return text