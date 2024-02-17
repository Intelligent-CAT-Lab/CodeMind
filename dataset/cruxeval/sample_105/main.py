def f(text):
    if not text.istitle():
        return text.title()
    return text.lower()