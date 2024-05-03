def f(s1, s2):
    position = 1	## position = []
    count = 0	## count = []
    while position > 0:	## position = []
        position = s1.find(s2, position)	## position = [] | s1 = [] | s2 = []
        count += 1	## count = []
        position += 1	## position = []
    return count	## count = []
