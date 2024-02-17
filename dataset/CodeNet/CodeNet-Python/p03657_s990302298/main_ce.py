a,b=map(int,"4 5".split())
if a%3==0 or b%3==0 or (a+b)%3==0:
  print("Possible")
else:
  print("Impossible")