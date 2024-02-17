def f(text, num_digits):
    width = max(1, num_digits)
    return text.zfill(width)