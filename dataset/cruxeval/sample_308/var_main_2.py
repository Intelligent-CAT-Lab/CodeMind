def f(strings):
    occurances = {}	## occurances = []
    for string in strings:	## string = [] | strings = []
        if string not in occurances:	## string = [] | occurances = []
            occurances[string] = strings.count(string)	## occurances = [] | string = [] | strings = []
    return occurances	## occurances = []
