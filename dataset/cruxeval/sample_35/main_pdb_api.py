def f(pattern, items):
    result = []
    for text in items:
        pos = text.rfind(pattern)
        if pos >= 0:
            result.append(pos)

    return result
f(" B ", [" bBb ", " BaB ", " bB", " bBbB ", " bbb"])