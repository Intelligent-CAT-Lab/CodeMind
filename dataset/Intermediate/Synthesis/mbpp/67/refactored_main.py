n = 2
bell = [[0 for i in range(n+1)] for j in range(n+1)] 
bell[0][0] = 1
for i in range(1, n+1): 
    bell[i][0] = bell[i-1][i-1]  
    for j in range(1, i+1): 
        bell[i][j] = bell[i-1][j-1] + bell[i][j-1]   
print(bell[n][0])