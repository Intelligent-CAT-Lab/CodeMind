class main:
    def isLatinLetter(c):
        return c >= 'a' and c <= 'z'
    
    def iscodeforces_147_A(c):
        if c == '.':
            return True
        if c == ',':
            return True
        if c == '!':
            return True
        if c == '?':
            return True
        return False
    
    s = input()
    sb = ''
    n = len(s)
    sb += s[0]
    for i in range(1, n):
        c = s[i]
        if isLatinLetter(c):
            if not isLatinLetter(s[i - 1]):
                sb += ' '
            sb += c
        elif iscodeforces_147_A(c):
            sb += c
    print(sb)