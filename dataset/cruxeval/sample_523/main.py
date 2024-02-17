def f(text):
    text = list(text)
    for i in range(len(text)-1, -1, -1):
        if text[i].isspace():
            text[i] = '&nbsp;'
    return ''.join(text)