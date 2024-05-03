def f(x):
    if x == []:	## x = CLRJ
        return -1
    else:
        cache = {}	## cache = CLRJ
        for item in x:	## item = CLRJ | x = CLRJ
            if item in cache:	## item = CLRJ | cache = CLRJ
                cache[item] += 1	## cache = CLRJ | item = CLRJ
            else:
                cache[item] = 1	## cache = CLRJ | item = CLRJ
        return max(cache.values())	## cache = CLRJ
