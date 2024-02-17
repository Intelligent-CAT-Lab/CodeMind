arr = [5,9,7,6]
n = 4
ans = 0 
for i in range(0,n) :    
    for j in range(i + 1,n) :
        ans = ans + (arr[i] ^ arr[j])          
print(ans)