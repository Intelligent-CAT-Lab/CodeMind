def f(text, pre):
    if not text.startswith(pre):
        return text
    return text.removeprefix(pre)