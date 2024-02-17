def f(text):
    text = text.lower()
    head, tail = text[0], text[1:]
    return head.upper() + tail