def f(text, chars):
    if chars:
        text = text.rstrip(chars)
    else:
        text = text.rstrip(' ')
    if text == '':
        return '-'
    return text