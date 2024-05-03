def f(array):
    d = dict(array)	## d = [] | array = []
    for key, value in d.items():	## key = [] | value = [] | d = []
        if value < 0 or value > 9:	## value = []
            return None
    return d	## d = []
