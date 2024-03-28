class main:
    s = input()
    t = ""
    for i in range(len(s)):
        c = s[i]
        if c >= 'a' and c <= 'z':
            c = chr(ord(c) - 32)
        t += c
    print(t)
    
    /p0000