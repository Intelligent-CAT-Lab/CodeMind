X = 'AGGT12'
Y = '12TXAYB'
Z = '12XBA'
m = len(X)
n = len(Y)
o = len(Z)
L = [[[0 for i in range(o+1)] for j in range(n+1)] for k in range(m+1)]
for i in range(m+1): 
    for j in range(n+1): 
        for k in range(o+1): 
            if (i == 0 or j == 0 or k == 0): 
                L[i][j][k] = 0
            elif (X[i-1] == Y[j-1] and X[i-1] == Z[k-1]): 
                L[i][j][k] = L[i-1][j-1][k-1] + 1
            else: 
                L[i][j][k] = max(max(L[i-1][j][k], L[i][j-1][k]), L[i][j][k-1]) 
print(L[m][n][o])