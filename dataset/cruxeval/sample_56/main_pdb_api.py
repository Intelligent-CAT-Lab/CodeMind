def f(sentence):
    for c in sentence:
        if c.isascii() is False:
            return False
        else:
            continue
    return True
f('1z1z1')