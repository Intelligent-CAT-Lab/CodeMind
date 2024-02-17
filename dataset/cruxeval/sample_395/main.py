def f(s):
    for i in range(len(s)):
        if s[i].isdecimal():
            return i + (s[i] == '0')
        elif s[i] == '0':
            return -1
    return -1