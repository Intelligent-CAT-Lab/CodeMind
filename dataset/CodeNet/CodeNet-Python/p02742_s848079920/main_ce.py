H, W = map(int,"4 5".split())
if H == 1 or W == 1:
  print(1)
else:
  ans = H*(W//2) + (H+1)//2*(W%2)
  print(ans)