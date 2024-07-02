def f(text, chars):
    if chars:
        text = text.rstrip(chars)
    else:
        text = text.rstrip(' ')
    if text == '':
        return '-'
    return text
f('new-medium-performing-application - XQuery 2.2', '0123456789-')