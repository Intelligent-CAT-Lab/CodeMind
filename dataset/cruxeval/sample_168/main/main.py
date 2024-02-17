def f(text, new_value, index):
    key = text.maketrans(text[index], new_value)
    return text.translate(key)