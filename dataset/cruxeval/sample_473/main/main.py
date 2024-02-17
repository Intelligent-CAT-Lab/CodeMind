def f(text, value):
    indexes = list()
    for i in range(len(text)):
        if text[i] == value:
            indexes.append(i)
    new_text = list(text)
    for i in indexes:
        new_text.remove(value)
    return ''.join(new_text)