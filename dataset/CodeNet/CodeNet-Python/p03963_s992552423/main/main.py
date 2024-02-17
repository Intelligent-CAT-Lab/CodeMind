N,K = list(map(int,input().split()))
ans = 0
if N==1:
  print(K)
else:
  print((K*(K-1)**(N-1)))