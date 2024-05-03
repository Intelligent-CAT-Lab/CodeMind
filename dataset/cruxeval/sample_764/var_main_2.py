def f(text, old, new):
    text2 = text.replace(old, new)	## text2 = [] | text = [] | old = [] | new = []
    old2 = old[::-1]	## old2 = [] | old = []
    while old2 in text2:	## old2 = [] | text2 = []
        text2 = text2.replace(old2, new)
    return text2	## text2 = []
