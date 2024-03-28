import sys

while True:
    try:
        s = input()
        t = ""
        for i in range(len(s)):
            c = s[i]
            if c >= 'a' and c <= 'z':
                t += chr(ord(c) - 32)
            else:
                t += c
        print(t)
    except EOFError:
        break