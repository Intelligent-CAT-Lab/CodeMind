def f(text):
    (k, l) = (0, len(text) - 1)
    while not text[l].isalpha():
        l -= 1
    while not text[k].isalpha():
        k += 1
    if k != 0 or l != len(text) - 1:
        return text[k: l+1]
    else:
        return text[0]