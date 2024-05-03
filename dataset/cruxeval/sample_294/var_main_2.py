def f(n, m, text):
    if text.strip() == '':	## text = []
        return text
    head, mid, tail = text[0], text[1:-1], text[-1]	## head = [] | mid = [] | tail = [] | text = []
    joined = head.replace(n, m) + mid.replace(n, m) + tail.replace(n, m)	## joined = [] | head = [] | n = [] | m = [] | mid = [] | tail = []
    return joined	## joined = []
