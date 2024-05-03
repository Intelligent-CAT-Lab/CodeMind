def f(places, lazy):
    places.sort()	## <state>places = CLRJ</state>
    for lazy in lazy:	## <state>lazy = CLRJ</state>
        places.remove(lazy)	## <state>places = CLRJ | lazy = CLRJ</state>
    if len(places) == 1:	## <state>places = CLRJ</state>
        return 1
    for i, place in enumerate(places):	## <state>i = CLRJ | place = CLRJ | places = CLRJ</state>
        if places.count(place+1) == 0:	## <state>places = CLRJ | place = CLRJ</state>
            return i+1	## <state>i = CLRJ</state>
    return i+1