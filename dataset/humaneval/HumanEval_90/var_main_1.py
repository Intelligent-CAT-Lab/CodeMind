def next_smallest(lst):
    lst = sorted(set(lst))	## lst = CLRJ
    return None if len(lst) < 2 else lst[1]	## lst = CLRJ
