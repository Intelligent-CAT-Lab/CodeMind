def f(text, delimiter):
    text = text.rpartition(delimiter)
    return text[0] + text[-1]