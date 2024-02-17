n = 0
if n and not n & (n - 1):
  print(n)
else:
  count = 0
  while n != 0: 
    n >>= 1
    count += 1
  print(1 << count)