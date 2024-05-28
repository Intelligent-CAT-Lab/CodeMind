A = [1,4,3,5]
B = [1,2]
n = len(A)
m = len(B)
i = 0
j = 0
while (i < n and j < m):  
    if (A[i] == B[j]): 
        i += 1 
        j += 1 
        if (j == m): 
            print(True) 
            break 
    else: 
        i = i - j + 1
        j = 0
else:       
    print(False)