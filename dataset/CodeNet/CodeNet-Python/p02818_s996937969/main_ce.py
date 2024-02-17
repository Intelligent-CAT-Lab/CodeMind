a, b, k=map(int, "2 3 3".split())
if a>=k:
  print(a-k, b)
elif a+b>=k:
  print(0, a+b-k)
else: 
  print(0, 0)
