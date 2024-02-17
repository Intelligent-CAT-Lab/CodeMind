N,A,B=list(map(int,input().split()))
if N>A*B or N<A+B-1:
  print((-1))
  exit()
P=[[] for i in range(B)]
for i in range(N):
  P[i//A].append(i+1)
P=P[::-1]
for i in range(B):
  if len(P[i])==0:
    P[i].append(P[-((N-i-1)//A+1)][-1])
    del P[-((N-i-1)//A+1)][-1]
  else:
    break
Q=[]
for i in range(B):
  for j in range(len(P[i])):
    Q.append(P[i][j])
print((*Q))