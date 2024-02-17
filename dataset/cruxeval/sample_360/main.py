def f(text, n):
    if len(text) <= 2:
        return text
    leading_chars = text[0] * (n - len(text) + 1)
    return leading_chars + text[1:-1] + text[-1]