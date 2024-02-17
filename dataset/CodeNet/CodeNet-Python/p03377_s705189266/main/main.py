l = [int(x) for x in input().split(' ')]
if l[0] <= l[2] and l[0] + l[1] >= l[2]:
  print("YES")
else:
  print("NO")