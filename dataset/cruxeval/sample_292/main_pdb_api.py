def f(text):
    new_text = [c if c.isdigit() else '*' for c in text]
    return ''.join(new_text)
f('5f83u23saa')