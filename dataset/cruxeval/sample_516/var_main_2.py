def f(strings, substr):
    list = [s for s in strings if s.startswith(substr)]	## list = [] | s = [] | strings = [] | substr = []
    return sorted(list, key=len)	## list = []
