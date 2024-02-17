# -*- coding: utf-8 -*-
a, b = map(int, input().split())
cnt = 0

# 偶数
#if a != 0:
#    if a % 2 != 0:
#        a = a - 1

# 奇数


# 組み合わせ
nCr = {}

# https://qiita.com/derodero24/items/91b6468e66923a87f39f
def cmb(n, r):
    if r == 0 or r == n: return 1
    if r == 1: return n
    if (n, r) in nCr: return nCr[(n, r)]
    nCr[(n, r)] = cmb(n - 1, r) + cmb(n - 1, r - 1)
    return nCr[(n, r)]


#
if a > 1:
    cnt = cnt + cmb(a, 2)

if b > 1:
    cnt = cnt + cmb(b, 2)
print(cnt)
