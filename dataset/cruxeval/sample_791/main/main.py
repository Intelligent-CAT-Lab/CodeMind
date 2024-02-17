def f(integer, n):
    i = 1
    text = str(integer)
    while (i+len(text) < n):
        i += len(text)
    return text.zfill(i+len(text))