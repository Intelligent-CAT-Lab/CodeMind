def f(places, lazy):
    places.sort()	## places = CLRJ
    for lazy in lazy:	## lazy = CLRJ
        places.remove(lazy)	## places = CLRJ | lazy = CLRJ
    if len(places) == 1:	## places = CLRJ
        return 1
    for i, place in enumerate(places):	## i = CLRJ | place = CLRJ | places = CLRJ
        if places.count(place+1) == 0:	## places = CLRJ | place = CLRJ
            return i+1	## i = CLRJ
    return i+1