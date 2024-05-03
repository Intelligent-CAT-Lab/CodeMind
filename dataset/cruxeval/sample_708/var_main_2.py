def f(string):
    l = list(string)	## l = [] | string = []
    for i in reversed(range(len(l))):	## i = [] | l = []
        if l[i] != ' ':	## l = [] | i = []
            break
        l.pop(i)	## l = [] | i = []
    return ''.join(l)	## l = []
