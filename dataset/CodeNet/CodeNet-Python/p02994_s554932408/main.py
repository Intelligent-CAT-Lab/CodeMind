N, L = map(int, input().split())
A = []

for i in range(1,N+1):
  A.append(L+i-1)

if L < 0 and 0 not in A:
  A.remove(A[-1])
  print(sum(A))
elif 0 in A:
  print(sum(A))
elif L >= 0:
  A.remove(A[0])
  print(sum(A))