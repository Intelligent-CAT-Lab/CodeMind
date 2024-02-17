n = list(map(int, "1 7 9 4".split()))
check = sum(x==1 for x in n) * sum(x==9 for x in n) * sum(x==7 for x in n) * sum(x==4 for x in n)
if check == 1:
  print("YES")
else:
  print("NO")