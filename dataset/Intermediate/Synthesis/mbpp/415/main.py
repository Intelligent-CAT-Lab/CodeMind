def max_Product(arr): 
    arr_len = len(arr) 
    if (arr_len < 2): 
        return ("No pairs exists")           
    x = arr[0]; y = arr[1]      
    for i in range(0,arr_len): 
        for j in range(i + 1,arr_len): 
            if (arr[i] * arr[j] > x * y): 
                x = arr[i]; y = arr[j] 
    return x,y    