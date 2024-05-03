def f(number):
    transl = {'A': 1, 'B': 2, 'C': 3, 'D': 4, 'E': 5}	## transl = []
    result = []	## result = []
    for key, value in transl.items():	## key = [] | value = [] | transl = []
        if value % number == 0:	## value = [] | number = []
            result.append(key)	## result = [] | key = []
    return result	## result = []
