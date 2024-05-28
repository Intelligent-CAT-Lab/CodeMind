arr = [1,2,3,1,1,4,5,6]
arr.sort() 
sum = arr[0] 
for i in range(len(arr)-1): 
    if (arr[i] != arr[i+1]): 
        sum = sum + arr[i+1]   
print(sum)