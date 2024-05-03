def f(text):
    i = (len(text) + 1) // 2	## i = [] | text = []
    result = list(text)	## result = [] | text = []
    while i < len(text):	## i = [] | text = []
        t = result[i].lower()	## t = [] | result = [] | i = []
        if t == result[i]:	## t = [] | result = [] | i = []
            i += 1	## i = []
        else:
            result[i] = t	## result = [] | i = [] | t = []
        i += 2	## i = []
    return ''.join(result)	## result = []
