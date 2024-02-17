import math
n, m = map(int, "2 2".split())
mod = 10 ** 9 + 7
if n == m:
  res = 2 * math.factorial(n) * math.factorial(m)
  print(res % mod)
elif abs(n - m) == 1:
  res = math.factorial(n) * math.factorial(m)
  print(res % mod)  
else:
  print(0)