def f(n, m, text):
    if text.strip() == '':
        return text
    head, mid, tail = text[0], text[1:-1], text[-1]
    joined = head.replace(n, m) + mid.replace(n, m) + tail.replace(n, m)
    return joined