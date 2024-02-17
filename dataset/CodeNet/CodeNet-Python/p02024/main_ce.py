h, w, s, t = map(int, "4 5 2 3".split())
if h * w % 2 == 1:
  if (s + t) % 2 == 1:
    print("No")
  else:
    print("Yes")
else:
  print("Yes")
