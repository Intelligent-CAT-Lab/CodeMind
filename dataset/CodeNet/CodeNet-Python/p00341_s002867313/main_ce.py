lst = sorted(map(int, "1 1 3 4 8 9 7 3 4 5 5 5".split()))
if lst[0] == lst[3] and lst[4] == lst[7] and lst[8] == lst[11]:
  print("yes")
else:
  print("no")
