n, m = map(int, raw_input().split())

mod = int(1e9) + 7

if n > m:
  n, m = m, n

def p(n):
  ret = 1
  for i in xrange(1, n + 1):
    ret = ret * i % mod
  return ret
    

def solve(n, m):
  if n == m:
    return p(n) * p(m) * 2 % mod
  else:
    return p(n) * p(m) % mod

if n == m or n + 1 == m:
  print(solve(n, m))
else:
  print(0)
