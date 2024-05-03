def f(text):
    for c in text:	## c = [] | text = []
        if not c.isnumeric():	## c = []
            return False
    return bool(text)	## text = []
