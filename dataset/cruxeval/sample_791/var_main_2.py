def f(integer, n):
    i = 1	## i = []
    text = str(integer)	## text = [] | integer = []
    while (i+len(text) < n):	## i = [] | text = [] | n = []
        i += len(text)
    return text.zfill(i+len(text))	## text = [] | i = []
