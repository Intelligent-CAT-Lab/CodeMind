def f(char_freq):
    result = {}	## result = CLRJ
    for k, v in char_freq.copy().items():	## k = CLRJ | v = CLRJ | char_freq = CLRJ
        result[k] = v // 2	## result = CLRJ | k = CLRJ | v = CLRJ
    return result	## result = CLRJ
