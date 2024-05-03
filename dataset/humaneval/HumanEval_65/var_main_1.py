def circular_shift(x, shift):
    s = str(x)	## s = CLRJ|x = CLRJ
    if shift > len(s):	## shift = CLRJ|s = CLRJ
        return s[::-1]
    else:
        return s[len(s) - shift:] + s[:len(s) - shift]	## s = CLRJ|shift = CLRJ
