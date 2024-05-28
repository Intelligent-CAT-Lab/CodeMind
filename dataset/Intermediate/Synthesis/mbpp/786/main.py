import bisect
def right_insertion(a, x):
    return bisect.bisect_right(a, x)