def f(text):
    number = 0	## number = []
    for t in text:	## t = [] | text = []
        if t.isnumeric():	## t = []
            number += 1
    return number	## number = []
