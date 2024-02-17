def f(text):
    text = list(text)
    for i in range(len(text)):
        if i % 2 == 1:
            text[i] = text[i].swapcase()
    return ''.join(text)