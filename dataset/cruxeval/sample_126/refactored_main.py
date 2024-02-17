text = 'kkxkxxfck'
s = text.rpartition('o')
div, div2 = (s[0] == '' and '-' or s[0]), (s[2] == '' and '-' or s[2])
print(s[1] + div + s[1] + div2)