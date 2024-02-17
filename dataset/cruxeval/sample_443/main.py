def f(text):
    for space in text:
        if space == ' ':
            text = text.lstrip()
        else:
            text = text.replace('cd', space)
    return text