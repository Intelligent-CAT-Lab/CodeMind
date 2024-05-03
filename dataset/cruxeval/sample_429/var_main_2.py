def f(d):
    result = []	## result = []
    while len(d.keys()) > 0:	## d = []
        result.append(d.popitem())	## result = [] | d = []
    return result	## result = []
