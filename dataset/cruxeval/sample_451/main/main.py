def f(text, char):
    text = list(text)
    for count, item in enumerate(text):
        if item == char:
            text.remove(item)
            return ''.join(text)
    return text