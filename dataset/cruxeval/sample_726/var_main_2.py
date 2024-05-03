def f(text):
    ws = 0	## ws = []
    for s in text:	## s = [] | text = []
        if s.isspace():	## s = []
            ws += 1	## ws = []
    return ws, len(text)	## ws = [] | text = []
