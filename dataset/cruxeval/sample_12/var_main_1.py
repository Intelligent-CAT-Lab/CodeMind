def f(s, x):
    count = 0	## count = CLRJ
    while s[:len(x)] == x and count < len(s)-len(x):	## s = CLRJ | x = CLRJ | count = CLRJ
        s = s[len(x):]
        count += len(x)
    return s	## s = CLRJ
