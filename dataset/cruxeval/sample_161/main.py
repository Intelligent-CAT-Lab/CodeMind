def f(text, value):
    left, _, right = text.partition(value)
    return right + left