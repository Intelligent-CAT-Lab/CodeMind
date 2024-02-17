def f(s):
    if str.isascii(s[-5:]):
        return s[-5:], s[0:][:3]
    elif str.isascii(s[:5]):
        return s[:5], s[-5:][3:]
    else:
        return s