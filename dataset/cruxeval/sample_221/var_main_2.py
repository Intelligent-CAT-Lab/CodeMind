def f(text, delim):
    first, second = text.split(delim)	## first = [] | second = [] | text = [] | delim = []
    return second + delim + first	## second = [] | delim = [] | first = []
