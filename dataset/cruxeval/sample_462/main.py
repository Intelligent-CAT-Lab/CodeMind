def f(text, value):
    length = len(text)
    letters = list(text)
    if value not in letters:
        value = letters[0]
    return value * length