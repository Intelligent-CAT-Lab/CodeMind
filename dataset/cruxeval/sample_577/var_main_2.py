def f(items):
    result = []	## result = []
    for number in items:	## number = [] | items = []
        d = dict(items).copy()	## d = [] | items = []
        d.popitem()	## d = []
        result.append(d)	## result = [] | d = []
        items = d	## items = [] | d = []
    return result	## result = []
