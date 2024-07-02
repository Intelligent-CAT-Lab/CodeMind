import bisect
def right_insertion(a, x):
    return bisect.bisect_right(a, x)
right_insertion([1,2,4,5],6)