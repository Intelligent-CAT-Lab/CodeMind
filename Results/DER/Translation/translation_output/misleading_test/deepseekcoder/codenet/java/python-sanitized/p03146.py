def p03146(s):
    seen = {s}
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in seen:
            return i
        else:
            seen.add(s)

print(p03146(int(input())))