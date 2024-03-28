class main:
    s = int(input())
    set = set()
    set.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s / 2
        else:
            s = 3 * s + 1
        if s in set:
            print(i)
            break
        else:
            set.add(s)