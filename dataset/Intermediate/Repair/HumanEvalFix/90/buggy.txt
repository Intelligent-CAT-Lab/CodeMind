def next_smallest(lst):
    lst = sorted(set(lst))
    return None if len(lst) < 3 else lst[1]
