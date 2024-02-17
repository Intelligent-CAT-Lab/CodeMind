def f(text, num):
    req = num - len(text)
    text = text.center(num, '*')
    return text[:req // 2: -req // 2]