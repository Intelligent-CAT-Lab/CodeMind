arr = [1,1,1,1]
sum = 2
count = 0  
for i in range(len(arr)):
    for j in range(i + 1,len(arr)):
        if arr[i] + arr[j] == sum:
            count += 1
print(count)