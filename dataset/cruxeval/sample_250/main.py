def f(text):
    count = len(text)
    for i in range(-count+1, 0):
        text = text + text[i]
    return text