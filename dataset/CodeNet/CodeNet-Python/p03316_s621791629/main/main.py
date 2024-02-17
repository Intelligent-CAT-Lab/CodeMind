n = eval(input())
s = 0
for i in range(len(n)) :
  s += int(n[i])
if int(n)%s == 0 :
  print('Yes')
else :
  print('No')
