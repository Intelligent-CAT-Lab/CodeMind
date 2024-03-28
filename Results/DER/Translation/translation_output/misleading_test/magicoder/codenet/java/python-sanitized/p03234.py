import sys

mod = int(1e9+7)

def ways_to_pair(x):
    if memo_ways_to_pair[x] != -1:
        return memo_ways_to_pair[x]

    if x % 2 == 1:
        memo_ways_to_pair[x] = 0
    elif x == 0:
        memo_ways_to_pair