def f(lst):
    lst.clear()	## lst = []
    lst += [1] * (len(lst) + 1)	## lst = []
    return lst	## lst = []
