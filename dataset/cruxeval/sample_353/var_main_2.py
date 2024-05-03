def f(x):
    if x == []:	## x = []
        return -1
    else:
        cache = {}	## cache = []
        for item in x:	## item = [] | x = []
            if item in cache:	## item = [] | cache = []
                cache[item] += 1	## cache = [] | item = []
            else:
                cache[item] = 1	## cache = [] | item = []
        return max(cache.values())	## cache = []
