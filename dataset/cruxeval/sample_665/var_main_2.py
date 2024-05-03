def f(chars):
    s = ""	## s = []
    for ch in chars:	## ch = [] | chars = []
        if chars.count(ch) % 2 == 0:	## chars = [] | ch = []
            s += ch.upper()	## s = [] | ch = []
        else:
            s += ch	## s = [] | ch = []
    return s	## s = []
