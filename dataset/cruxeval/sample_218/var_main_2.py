def f(string, sep):
    cnt = string.count(sep)	## cnt = [] | string = [] | sep = []
    return((string+sep) * cnt)[::-1]	## string = [] | sep = [] | cnt = []
