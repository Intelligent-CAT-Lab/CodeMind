def f(text, count):
    for i in range(count):
        text = ''.join(reversed(text))
    return text