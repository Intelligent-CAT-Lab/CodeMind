def f(text):
    chars = []
    for c in text:
        if c.isdigit():
            chars.append(c)
    return ''.join(chars[::-1])
f('--4yrw 251-//4 6p')