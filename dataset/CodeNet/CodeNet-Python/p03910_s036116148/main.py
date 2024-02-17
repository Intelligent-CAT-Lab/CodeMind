n = int(input())
ans = 0
lst = []
for i in range(1,n+1):
  ans += i
  lst.append(i)
  if ans>=n:
    break
  
num = ans-n
if num != 0:
  lst.remove(num)

L =len(lst)
for i in range(L):
  print(lst[i])