def f(text):
    for i in range(len(text)):
        if text[i] == ' ':
            text = text.replace(' ', '\t', 1)
    return text.expandtabs(4)