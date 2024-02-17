X, Y = map(int, input().split())

for i in range(10**18):
  if X*2**i>Y:
    print(i)
    break