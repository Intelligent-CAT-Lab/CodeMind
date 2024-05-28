def count_rotation(arr):   
    for i in range (1,len(arr)): 
        if (arr[i] < arr[i - 1]): 
            return i  
    return 0