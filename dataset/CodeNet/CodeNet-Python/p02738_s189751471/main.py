from functools import lru_cache

N, M = map(int, input().split())

@lru_cache(maxsize=None)
def mod_inv(x):
  x1, y1, z1 = 1, 0, x
  x2, y2, z2 = 0, 1, M
  while z1 != 1:
    d, m = divmod(z2, z1)
    x1, x2 = x2-d*x1, x1
    y1, y2 = y2-d*y1, y1
    z1, z2 = m, z1
  return x1%M

def gen_Y(i):
  # sC2/1, (s-2)C2/2, (s-4)C2/3  ...
  s = 3*(N-i)
  r = s*(s-1)>>1
  d_r = (s<<1)-3
  for j in range(1, N-i+1):
    yield r * mod_inv(j)
    r -= d_r
    d_r -= 4

def gen_X():
  # sC3*2/1, (s-3)C3*2/2, (s-6)C3*2/3  ...
  a = N
  b = 3*N - 1
  for i in range(1, N+1):
    yield a * b * (b-1) * mod_inv(i)
    a -= 1
    b -= 3

def acc_mulmod(it, init=1):
  x = init
  yield x
  for y in it:
    x = x*y % M
    yield x

ans = sum(sum(acc_mulmod(gen_Y(i), A)) for i, A in enumerate(acc_mulmod(gen_X())))%M

print(ans)
