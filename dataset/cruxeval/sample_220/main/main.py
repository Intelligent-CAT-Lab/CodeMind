def f(text, m, n):
    text = "{}{}{}".format(text, text[:m], text[n:])
    result = ""
    for i in range(n, len(text)-m):
        result = text[i] + result
    return result