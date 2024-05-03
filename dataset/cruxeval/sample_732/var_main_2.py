def f(char_freq):
    result = {}	## result = []
    for k, v in char_freq.copy().items():	## k = [] | v = [] | char_freq = []
        result[k] = v // 2	## result = [] | k = [] | v = []
    return result	## result = []
