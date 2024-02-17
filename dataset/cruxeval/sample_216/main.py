def f(letters):
    count = 0
    for l in letters:
        if l.isdigit():
            count += 1
    return count