def f(s):
    count = 0	## {"count" : ''}
    digits = ""	## {"digits" : ''}
    for c in s:	## {"c" : '',"s" : ''}
        if c.isdigit():	## {"c" : ''}
            count += 1	## {"count" : ''}
            digits += c	## {"digits" : '',"c" : ''}
    return [digits, count]	## {"digits" : '',"count" : ''}
