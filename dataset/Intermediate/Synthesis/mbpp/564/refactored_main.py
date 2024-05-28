arr = [1,2,1]
n = 3
cnt = 0; 
for i in range(n): 
    for j in range(i + 1,n): 
        if (arr[i] != arr[j]): 
            cnt += 1; 
print(cnt);