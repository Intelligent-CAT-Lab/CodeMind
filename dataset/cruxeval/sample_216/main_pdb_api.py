def f(letters):
    count = 0
    for l in letters:
        if l.isdigit():
            count += 1
    return count
f("dp ef1 gh2")