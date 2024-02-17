def f(needle, haystack):
    count = 0
    while needle in haystack:
        haystack = haystack.replace(needle, '', 1)
        count += 1
    return count