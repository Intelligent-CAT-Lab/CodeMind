def f(text, value):
    if not value in text:
        return ''
    return text.rpartition(value)[0]
f('mmfbifen', 'i')