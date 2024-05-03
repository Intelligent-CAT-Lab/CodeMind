def f(full, part):
    length = len(part)	## length = [] | part = []
    index = full.find(part)	## index = [] | full = [] | part = []
    count = 0	## count = []
    while index >= 0:	## index = []
        full = full[index + length:]	## full = [] | index = [] | length = []
        index = full.find(part)	## index = [] | full = [] | part = []
        count += 1	## count = []
    return count	## count = []
