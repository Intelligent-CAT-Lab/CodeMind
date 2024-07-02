def is_product_even(arr): 
    for i in range(len(arr)): 
        if (arr[i] & 1) == 0: 
            return True
    return False
is_product_even([1,2,3])