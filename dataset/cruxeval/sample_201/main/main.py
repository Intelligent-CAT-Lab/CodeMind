def f(text):
    chars = []
    for c in text:
        if c.isdigit():
            chars.append(c)
    return ''.join(chars[::-1])