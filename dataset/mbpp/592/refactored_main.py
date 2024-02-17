n = 3
C = [0] * (2 * n + 1)
C[0] = 1
for i in range(1,2 * n + 1):  
    for j in range(min(i, 2 * n),0,-1): 
        C[j] = C[j] + C[j - 1]
print(C[n-1])