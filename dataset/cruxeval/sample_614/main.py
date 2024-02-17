def f(text, substr, occ):
    n = 0
    while True:
        i = text.rfind(substr)
        if i == -1:
            break
        elif n == occ:
            return i
        else:
            n += 1
            text = text[:i]
    return -1