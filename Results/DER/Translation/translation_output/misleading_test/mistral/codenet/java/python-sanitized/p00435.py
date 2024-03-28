def p00435():
    s = ""
    for c in input():
        s += chr(((ord(c) - 42) % 26) + 65)
    print(s)

p00435()