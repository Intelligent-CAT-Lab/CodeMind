def max_length(list1):
    max_length = max(len(x) for x in  list1 )  
    max_list = max((x) for x in   list1)
    return(max_length, max_list)
max_length([[0], [1, 3], [5, 7], [9, 11], [13, 15, 17]])