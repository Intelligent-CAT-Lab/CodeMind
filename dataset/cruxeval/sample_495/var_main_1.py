def f(s):
    if str.isascii(s[-5:]):	## s = CLRJ
        return s[-5:], s[0:][:3]
    elif str.isascii(s[:5]):	## s = CLRJ
        return s[:5], s[-5:][3:]	## s = CLRJ
    else:
        return s