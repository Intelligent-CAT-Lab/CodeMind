h, w, s, t = map(int, input().split())
if h * w % 2 == 1:
  if (s + t) % 2 == 1:
    print("No")
  else:
    print("Yes")
else:
  print("Yes")
