def f(text):
    for char in text:
        if not char.isspace():
            return False
    return True