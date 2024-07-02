def f(text):
    if text.isidentifier():
        return ''.join(c for c in text if c.isdigit())
    else:
        return ''.join(text)
f('816')