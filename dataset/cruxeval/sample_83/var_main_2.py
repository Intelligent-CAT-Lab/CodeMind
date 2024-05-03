def f(text):
    l = text.rpartition('0')	## l = [] | text = []
    if l[2] == '':	## l = []
        return '-1:-1'
    return f'{len(l[0])}:{l[2].find("0") + 1}'	## l = []
