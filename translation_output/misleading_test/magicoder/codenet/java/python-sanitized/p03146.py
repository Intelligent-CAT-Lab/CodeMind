def p03146(s):
    set_ = set()
    set_.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in set_:
            return i
        else:
            set_.add(s)

print(p03146(8))