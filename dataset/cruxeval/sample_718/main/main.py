def f(text):
    t = text
    for i in text:
        text = text.replace(i, '')
    return str(len(text)) + t