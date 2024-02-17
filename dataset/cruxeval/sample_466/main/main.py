def f(text):
    length = len(text)
    index = 0
    while index < length and text[index].isspace():
        index += 1
    return text[index:index+5]