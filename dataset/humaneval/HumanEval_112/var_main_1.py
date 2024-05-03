def reverse_delete(s,c):
    s = ''.join([char for char in s if char not in c])	## s = CLRJ|char = CLRJ|c = CLRJ
    return (s,s[::-1] == s)	## s = CLRJ
