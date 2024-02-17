def f(text):
    n = 0
    for char in text:
        if char.isupper():
            n += 1
    return n