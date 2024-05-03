def f(names, winners):
    ls = [names.index(name) for name in names if name in winners]	## ls = [] | names = [] | name = [] | winners = []
    ls.sort(reverse=True)	## ls = []
    return ls	## ls = []
