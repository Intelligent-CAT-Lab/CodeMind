def f(text, insert):
    whitespaces = {'\t', '\r', '\v', ' ', '\f', '\n'}
    clean = ''
    for char in text:
        if char in whitespaces:
            clean += insert
        else:
            clean += char
    return clean