def f(needle, haystack):
    count = 0	## count = []
    while needle in haystack:	## needle = [] | haystack = []
        haystack = haystack.replace(needle, '', 1)	## haystack = [] | needle = []
        count += 1	## count = []
    return count	## count = []
