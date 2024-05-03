def f(a, b, c):
    result = {}	## result = []
    for d in a, b, c:	## d = [] | a = [] | b = [] | c = []
        result.update(dict.fromkeys(d))	## result = [] | d = []
    return result	## result = []
