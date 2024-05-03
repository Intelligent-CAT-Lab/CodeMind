def f(array):
    l = len(array)	## l = [] | array = []
    if l % 2 == 0:	## l = []
        array.clear()	## array = []
    else:
        array.reverse()
    return array	## array = []
