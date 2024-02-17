def f(text, char):
    if text:
        text = text.removeprefix(char)
        text = text.removeprefix(text[-1])
        text = text[:-1] + text[-1].capitalize()
    return text