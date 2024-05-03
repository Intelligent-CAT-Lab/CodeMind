def f(d):
    i = len(d) - 1	## i = [] | d = []
    key = list(d.keys())[i]	## key = [] | d = [] | i = []
    d.pop(key, None)	## d = [] | key = []
    return key, d	## key = [] | d = []
