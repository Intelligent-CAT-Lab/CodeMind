def p04012(w):
    c = list(w)
    a = 'a'
    z = 'z'
    count = 0
    for i in range(ord(a), ord(z) + 1):
        for x in c:
            if x == chr(i):
                count += 1
        if count % 2 == 1:
            return "No"
        count = 0
    return "Yes"

print(p04012("abaccaba"))