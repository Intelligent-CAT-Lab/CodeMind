def f(s):
    count = 0	## count = CLRJ
    digits = ""	## digits = CLRJ
    for c in s:	## c = CLRJ | s = CLRJ
        if c.isdigit():	## c = CLRJ
            count += 1	## count = CLRJ
            digits += c	## digits = CLRJ | c = CLRJ
    return [digits, count]	## digits = CLRJ | count = CLRJ
