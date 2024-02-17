def f(text, c):
    ls = list(text)
    if c not in text:
        raise ValueError('Text has no {c}')
    ls.pop(text.rindex(c))
    return ''.join(ls)