def f(text):
    t = 5	## t = []
    tab = []	## tab = []
    for i in text:	## i = [] | text = []
        if i.lower() in 'aeiouy':	## i = []
            tab.append(i.upper() * t)	## tab = [] | i = [] | t = []
        else:
            tab.append(i * t)	## tab = [] | i = [] | t = []
    return ' '.join(tab)	## tab = []
