def pair_xor_Sum(arr,n) : 
    ans = 0 
    for i in range(0,n) :    
        for j in range(i + 1,n) :   
            ans = ans + (arr[i] ^ arr[j])          
    return ans 
pair_xor_Sum([5,9,7,6],4)