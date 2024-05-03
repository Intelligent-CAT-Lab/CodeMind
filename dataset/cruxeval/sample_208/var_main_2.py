def f(items):
    result = []	## result = []
    for item in items:	## item = [] | items = []
        for d in item:	## d = [] | item = []
            if not d.isdigit():	## d = []
                result.append(d)	## result = [] | d = []
    return result	## result = []
