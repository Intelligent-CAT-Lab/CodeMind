import bisect
def left_insertion(a, x):
    i = bisect.bisect_left(a, x)
    return i
left_insertion([1,2,4,5],6)