def f(text):
    a = text.strip().split(' ')	## a = [] | text = []
    for i in range(len(a)):	## i = [] | a = []
        if a[i].isdigit() is False:	## a = [] | i = []
            return '-'
    return " ".join(a)