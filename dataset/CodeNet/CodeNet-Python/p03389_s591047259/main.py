a=[int(i) for i in input().split()]
a.sort(reverse=True)

n1=a[0]-a[1]
n2=a[0]-a[2]
n0=a[1]-a[2]
if (n1 + n2) % 2 ==0:
  print(int((n1+n2)/2))
else:
  print(int((n1+n2+1)/2+1))