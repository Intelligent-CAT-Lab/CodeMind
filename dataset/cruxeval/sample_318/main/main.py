def f(value, char):
    total = 0
    for c in value:
        if c == char or c == char.lower():
            total += 1
    return total