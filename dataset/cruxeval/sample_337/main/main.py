def f(txt):
    d = []
    for c in txt:
        if c.isdigit():
            continue
        if c.islower():
            d.append(c.upper())
        elif c.isupper():
            d.append(c.lower())
    return ''.join(d)