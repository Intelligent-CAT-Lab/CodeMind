import sys

mod = (10**9)+7

def ways_to_pair(x, memoWaysToPair):
    if memoWaysToPair[x] != -1:
        return memoWaysToPair[x]

    if x%2 == 1:
        memoWaysToPair[x] = 0
    elif x == 0:
        memoWaysToPair[x] = 1
    else:
        memoWaysToPair[x] = ways_to_