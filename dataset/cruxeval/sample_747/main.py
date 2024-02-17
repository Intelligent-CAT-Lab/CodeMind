def f(text):
    if text == '42.42':
        return True
    for i in range(3, len(text) - 3):
        if text[i] == '.' and text[i - 3:].isdigit() and text[:i].isdigit():
            return True
    return False