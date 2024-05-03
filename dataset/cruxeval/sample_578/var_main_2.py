def f(obj):
    for k, v in obj.items():	## k = [] | v = [] | obj = []
        if v >= 0:	## v = []
            obj[k] = -v	## obj = [] | k = [] | v = []
    return obj	## obj = []
