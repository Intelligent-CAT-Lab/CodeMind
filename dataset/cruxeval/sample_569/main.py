def f(txt):
    coincidences = {}
    for c in txt:
        if c in coincidences:
            coincidences[c] += 1
        else:
            coincidences[c] = 1
    return sum(coincidences.values())