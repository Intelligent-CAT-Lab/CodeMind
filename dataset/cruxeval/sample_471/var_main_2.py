def f(val, text):
    indices = [index for index in range(len(text)) if text[index] == val]	## indices = [] | index = [] | text = [] | val = []
    if len(indices) == 0:	## indices = []
        return -1
    else:
        return indices[0]