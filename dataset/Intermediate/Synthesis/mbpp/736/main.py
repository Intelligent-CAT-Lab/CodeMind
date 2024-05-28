import bisect
def left_insertion(a, x):
    i = bisect.bisect_left(a, x)
    return i