def f(text):
    uppers = 0
    for c in text:
        if c.isupper():
            uppers += 1
    return text.upper() if uppers >= 10 else text