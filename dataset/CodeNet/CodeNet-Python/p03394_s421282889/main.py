n=int(input())
if n==3:
  print(22,3,5)
  exit()
if n==4:
  print(2,3,4,9)
  exit()
if n==5:
  print(2,3,4,6,9)
  exit()
a=n//4
b=n%4
ans=[]
for i in range(a):
  ans.extend((6*i+2,6*i+3,6*i+4,6*i+6))
if a%2==0:
  if b==1:
    ans.append(6*a+6)
  if b==2:
    ans.extend((6*a+2,6*a+4))
  if b==3:
    ans.extend((6*a+2,6*a+4,6*a+6))
else:
  if b==0:
    del ans[-1]
    ans.append(6*a+3)
  if b==1:
    ans.append(6*a+3)
  if b==2:
    ans.extend((6*a+3,6*a+6))
  if b==3:
    ans.extend((6*a+2,6*a+3,6*a+4))
print(*ans)
