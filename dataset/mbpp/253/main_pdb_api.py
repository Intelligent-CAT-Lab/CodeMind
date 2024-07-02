def count_integer(list1):
    ctr = 0
    for i in list1:
        if isinstance(i, int):
            ctr = ctr + 1
    return ctr
count_integer([1,2,'abc',1.2])