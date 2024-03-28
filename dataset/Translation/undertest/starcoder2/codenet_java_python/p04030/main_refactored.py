class main:
    s = input()
    t = ""
    for i in range(len(s)):
        if s[i] != 'B':
            t += s[i]
        elif t == "":
            continue
        else:
            t = t[:-1]
    print(t)