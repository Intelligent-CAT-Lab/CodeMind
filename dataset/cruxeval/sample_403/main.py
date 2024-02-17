def f(full, part):
    length = len(part)
    index = full.find(part)
    count = 0
    while index >= 0:
        full = full[index + length:]
        index = full.find(part)
        count += 1
    return count