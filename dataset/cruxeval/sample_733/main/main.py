def f(text):
    length = len(text) // 2
    left_half = text[:length]
    right_half = text[length:][::-1]
    return left_half + right_half