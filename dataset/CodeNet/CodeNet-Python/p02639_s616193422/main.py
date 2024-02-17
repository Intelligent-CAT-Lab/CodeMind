a = input().split()
for i in range(5):
  if i == int(a[i])-1:
    continue
  else:
    print(i+1)