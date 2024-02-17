def f(text, prefix):
    while text.startswith(prefix):
        text = text[len(prefix):] or text
    return text