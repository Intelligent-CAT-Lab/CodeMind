n = int("30")
for i in range(1, n + 1):
  if i % 3 == 0:
    print(" {}".format(i), end = "")
  else:
    x = i
    while x:
      if x % 10 == 3:
        print(" {}".format(i), end = "")
        break
      x //= 10
print()
