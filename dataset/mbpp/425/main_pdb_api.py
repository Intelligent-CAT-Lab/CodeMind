def count_element_in_list(list1, x): 
    ctr = 0
    for i in range(len(list1)): 
        if x in list1[i]: 
            ctr+= 1          
    return ctr
count_element_in_list([[1, 3], [5, 7], [1, 11], [1, 15, 7]],1)