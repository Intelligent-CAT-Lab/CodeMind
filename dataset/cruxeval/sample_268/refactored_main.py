s = 'h grateful k'
separator = ' '
for i in range(len(s)):
    if s[i] == separator:
        new_s = list(s)
        new_s[i] = '/'
        print(' '.join(new_s))