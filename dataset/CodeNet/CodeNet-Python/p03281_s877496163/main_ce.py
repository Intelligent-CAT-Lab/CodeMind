n=int("105")
if n<105:
  print(0)
else:
  ans=0
  for i in range(105,n+1,2):
    cnt=0
    for j in range(1,i+1,2):
      if i % j==0:
        cnt +=1
    else:
      if cnt == 8:
        ans +=1
  print(ans)