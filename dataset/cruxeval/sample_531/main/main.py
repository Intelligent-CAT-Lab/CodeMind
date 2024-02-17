def f(text, x):
    if text.removeprefix(x) == text:
        return f(text[1:], x)
    else:
        return text