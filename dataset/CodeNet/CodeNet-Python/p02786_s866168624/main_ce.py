h=int("2")
for i in range(10000000000):
  if 2**i>h:
    print(2**i-1)
    break