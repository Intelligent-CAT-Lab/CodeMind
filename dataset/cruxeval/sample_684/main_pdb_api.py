def f(text):
    trans = str.maketrans('"\'><', '9833')
    return text.translate(trans)
f("Transform quotations\"\nnot into numbers.")