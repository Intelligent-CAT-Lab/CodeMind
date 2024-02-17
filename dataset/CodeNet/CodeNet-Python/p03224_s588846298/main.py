N = int(input())
Nlist = [k*(k-1)//2 for k in range(10**3)]
if N not in Nlist:
    print('No')
    exit()
print('Yes')
k = Nlist.index(N)
S = [[0]*i for i in range(k)]
S[0] = [i+1 for i in range(k-1)]
for i in range(k-1):
    S[i+1] = [S[j][i] for j in range(i+1)]
    S[i+1] += [S[i][k-2]+j+1 for j in range(k-1-(i-1))]
print(k)
S = [[str(S[i][j]) for j in range(k-1)] for i in range(k)]
for i in range(k):
    print(' '.join([str(k-1)]+S[i]))