def f(text, n):
    if n < 0 or len(text) <= n:
        return text
    result = text[0 : n]
    i = len(result) - 1
    while i >= 0:
        if result[i] != text[i]:
            break
        i -= 1
    return text[0 : i + 1]