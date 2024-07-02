from itertools import groupby
def pack_consecutive_duplicates(list1):
    return [list(group) for key, group in groupby(list1)]
pack_consecutive_duplicates([0, 0, 1, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, 4, 4])