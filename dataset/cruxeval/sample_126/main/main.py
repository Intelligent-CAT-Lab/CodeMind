def f(text):
    s = text.rpartition('o')
    div, div2 = (s[0] == '' and '-' or s[0]), (s[2] == '' and '-' or s[2])
    return s[1] + div + s[1] + div2