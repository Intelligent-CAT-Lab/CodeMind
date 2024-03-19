def p03889(s):
    s = list(s)
    for i in range(len(s)):
        if s[i] == 'b':
            s[i] = 'd'
        elif s[i] == 'd':
            s[i] = 'b'
        elif s[i] == 'p':
            s[i] = 'q'
        elif s[i] == 'q':
            s[i] = 'p'
    s.reverse()
    if s == list(input_string):
        return "Yes"
    else:
        return "No"

input_string = "pdbq"
print(p03889(input_string))