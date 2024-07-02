def largest_neg(list1): 
    max = list1[0] 
    for x in list1: 
        if x < max : 
             max = x  
    return max
largest_neg([1,2,3,-4,-6])