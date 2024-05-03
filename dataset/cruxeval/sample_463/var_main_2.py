def f(dict):
    result = dict.copy()	## result = [] | dict = []
    remove_keys = []	## remove_keys = []
    for k, v in dict.items():	## k = [] | v = [] | dict = []
        if v in dict:	## v = [] | dict = []
            del result[k]	## result = [] | k = []
    return result	## result = []
