X, Y = map(int, "3 20".split())
for i in range(10**18):
  if X*2**i>Y:
    print(i)
    break