k = int(input())
n = 500
if k <= n:
  print(k)
  l = list(range(1,k+1)) + list(range(1,k+1)) 
  for i in range(k):
    a = [str(x) for x in l[i:i+k]]  
    print(" ".join(a))
else:
  print(n)
  for i in range(n):
    a = [ str(1+(i+j)%n+n*(i%2 == 0 and 1+(i+j)%n+n <= k)) for j in range(n)]
    print(" ".join(a))