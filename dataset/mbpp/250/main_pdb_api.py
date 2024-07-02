def count_X(tup, x): 
    count = 0
    for ele in tup: 
        if (ele == x): 
            count = count + 1
    return count 
count_X((10, 8, 5, 2, 10, 15, 10, 8, 5, 8, 8, 2),4)