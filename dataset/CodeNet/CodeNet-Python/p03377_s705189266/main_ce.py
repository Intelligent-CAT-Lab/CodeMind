l = [int(x) for x in "3 5 4".split(' ')]
if l[0] <= l[2] and l[0] + l[1] >= l[2]:
  print("YES")
else:
  print("NO")