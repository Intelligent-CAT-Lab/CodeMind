n,x = map(int,"5 2".split())
x = min(x,n-x)
n = n - x
ans = 0
while True:
  new_x = n%x 
  new_n = n//x
  if new_x ==0:
    print(ans+x*new_n*3)
    exit()
  else:
    ans = ans + x*new_n*3
    n = x
    x = new_x 