arr = [3,2,1]
for i in range (1,len(arr)): 
    if (arr[i] < arr[i - 1]): 
        i = i  
print(i)