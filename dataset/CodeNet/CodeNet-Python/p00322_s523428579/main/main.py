from itertools import permutations as pm

def judge(lst):
  a, b, c, d, e, f, g, h, i = lst
  return a + (b * 10 + c) + (d * 100 + e * 10 + f) == (g * 100 + h * 10 + i)

def solve(lst, rest):
  n = len(rest)
  if n == 0:
    return int(judge(lst))
  ans = 0
  for loc in pm(rest, n):
    tmp = lst[:]
    for i in loc:
      tmp[tmp.index(-1)] = i
    ans += judge(tmp)
  return ans

lst = list(map(int, input().split()))
rest = {i for i in range(1, 10)} - set(lst)
print((solve(lst, rest)))
