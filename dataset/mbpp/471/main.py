def find_remainder(arr, n): 
    mul = 1
    for i in range(len(arr)):  
        mul = (mul * (arr[i] % n)) % n 
    return mul % n 