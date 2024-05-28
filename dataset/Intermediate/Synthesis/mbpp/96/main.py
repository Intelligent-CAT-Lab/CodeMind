def divisor(n):
  for i in range(n):
    x = len([i for i in range(1,n+1) if not n % i])
  return x