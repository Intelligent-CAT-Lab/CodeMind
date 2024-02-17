def f(text):
    for i in range(len(text)-1):
        if text[i:].islower():
            return text[i + 1:]
    return ''