arr = [5, 6, 12, 1, 18, 8]
i = 0
sum = 0
for i in range(0, len(arr),2): 
    if (arr[i] % 2 == 0) : 
        sum += arr[i]  
print(sum)