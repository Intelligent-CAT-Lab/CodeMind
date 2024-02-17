def f(text, char):
    if not text.endswith(char):
        return f(char + text, char)
    return text