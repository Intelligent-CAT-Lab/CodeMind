def count_element_in_list(list1, x): 
    ctr = 0
    for i in range(len(list1)): 
        if x in list1[i]: 
            ctr+= 1          
    return ctr