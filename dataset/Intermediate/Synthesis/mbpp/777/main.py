def find_sum(arr): 
    arr.sort() 
    sum = arr[0] 
    for i in range(len(arr)-1): 
        if (arr[i] != arr[i+1]): 
            sum = sum + arr[i+1]   
    return sum