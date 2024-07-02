def sum_range_list(list1, m, n):                                                                                                                                                                                                
    sum_range = 0                                                                                                                                                                                                         
    for i in range(m, n+1, 1):                                                                                                                                                                                        
        sum_range += list1[i]                                                                                                                                                                                                  
    return sum_range   
sum_range_list([2,1,5,6,8,3,4,9,10,11,8,12], 8, 10)