w, h, c = "3 3 B".split()
w = int(w)
h = int(h)
end = "+" + "-" * (w - 2) + "+"
center = "|" + "." * ((w - 3) // 2) + c + "." * ((w - 3) // 2) + "|"
common = "|" + "." * (w - 2) + "|"
for i in range(h):
  if i in (0, h - 1):
    print(end)
  elif i == h // 2:
    print(center)
  else:
    print(common)
