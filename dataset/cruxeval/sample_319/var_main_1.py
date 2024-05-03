def f(needle, haystack):
    count = 0	## count = CLRJ
    while needle in haystack:	## needle = CLRJ | haystack = CLRJ
        haystack = haystack.replace(needle, '', 1)	## haystack = CLRJ | needle = CLRJ
        count += 1	## count = CLRJ
    return count	## count = CLRJ
