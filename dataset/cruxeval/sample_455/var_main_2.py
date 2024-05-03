def f(text):
    uppers = 0	## uppers = []
    for c in text:	## c = [] | text = []
        if c.isupper():	## c = []
            uppers += 1	## uppers = []
    return text.upper() if uppers >= 10 else text	## uppers = [] | text = []
