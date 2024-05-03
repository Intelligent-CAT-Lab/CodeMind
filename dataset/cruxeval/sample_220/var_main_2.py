def f(text, m, n):
    text = "{}{}{}".format(text, text[:m], text[n:])	## text = [] | m = [] | n = []
    result = ""	## result = []
    for i in range(n, len(text)-m):	## i = [] | n = [] | text = [] | m = []
        result = text[i] + result	## result = [] | text = [] | i = []
    return result	## result = []
