def f(text, substr, occ):
    n = 0	## n = []
    while True:
        i = text.rfind(substr)	## i = [] | text = [] | substr = []
        if i == -1:	## i = []
            break
        elif n == occ:	## n = [] | occ = []
            return i
        else:
            n += 1	## n = []
            text = text[:i]	## text = [] | i = []
    return -1