def f(places, lazy):
    places.sort()
    for lazy in lazy:
        places.remove(lazy)
    if len(places) == 1:
        return 1
    for i, place in enumerate(places):
        if places.count(place+1) == 0:
            return i+1
    return i+1