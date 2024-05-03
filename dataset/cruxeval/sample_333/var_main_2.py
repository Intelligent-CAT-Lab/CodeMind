def f(places, lazy):
    places.sort()	## places = []
    for lazy in lazy:	## lazy = []
        places.remove(lazy)	## places = [] | lazy = []
    if len(places) == 1:	## places = []
        return 1
    for i, place in enumerate(places):	## i = [] | place = [] | places = []
        if places.count(place+1) == 0:	## places = [] | place = []
            return i+1	## i = []
    return i+1