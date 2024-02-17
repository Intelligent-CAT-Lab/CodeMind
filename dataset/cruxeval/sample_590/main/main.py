def f(text):
    for i in range(10, 0, -1):
        text = text.lstrip(str(i))
    return text