def f(ints):
    counts = [0] * 301

    for i in ints:
        counts[i] += 1

    r = []
    for i in range(len(counts)):
        if counts[i] >= 3:
            r.append(str(i))
    counts.clear()
    return ' '.join(r)