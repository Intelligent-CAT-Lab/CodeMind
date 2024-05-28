def get_Inv_Count(arr): 
    inv_count = 0
    for i in range(len(arr)): 
        for j in range(i + 1, len(arr)): 
            if (arr[i] > arr[j]): 
                inv_count += 1
    return inv_count 