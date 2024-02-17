def popcnt(num):
    return bin(num).count('1')
# a -> bにする手順 (制約なし)
def solve(n, a, b):
    c = a ^ b
    # 0 -> a ^ b, popcnt(c)は奇数である必要がある
    if popcnt(c) % 2 == 0:
        print('NO')
        exit(0)
    return [i ^ a for i in solve2(n, c)]
# 0 -> cにする手順 (c: popcntは奇数)
def solve2(n, c):
    c_1 = popcnt(c)
    d = (1 << c_1) - 1  # 0..01..1
    ret_d = solve3(n, d, c_1)
    ret_c = move(ret_d, n, d, c)
    return ret_c
# 0 -> dにする手順 (d: 0..01..1)
def solve3(n, d, cnt):
    if n == cnt:
        return solve4(n)
    ret = []
    a = graycode(n - cnt)
    a_rev = a[::-1]
    b = solve4(cnt)
    flg = True
    for i in b:
        if flg:
            for j in a:
                ret.append(merge(j, i, cnt))
        else:
            for j in a_rev:
                ret.append(merge(j, i, cnt))
        flg = not flg
    return ret
# 0 -> (1<<n)-1 にする手順 (d: 1..1)
def solve4(n):
    if n == 1:
        return [0, 1]
    # 0 + 0 * (n - 1) -> 0 + 1 + 0 * (n - 2)
    # 1 + 1 + 0 * (n - 2) -> 1 + 1 * (n - 1) : 再帰的に
    ret = graycode(n - 1) + [(1 << (n - 1)) | i for i in solve(n - 1, 1 << n - 2, mask(n - 1))]
    return ret
# nビットのグレイコード
def graycode(n):
    ret = []
    for i in range(1 << n):
        ret.append(i ^ (i >> 1))
    return ret
# bitの移し換え 001111 -> 011011
def move(lst, n, d, c):
    l = [-1] * n
    c_0, c_1 = popcnt(c), 0
    for i in range(n):
        if c & (1 << i):
            l[c_1] = i
            c_1 += 1
        else:
            l[c_0] = i
            c_0 += 1
    ret = []
    for i in lst:
        k = 0
        for j in range(n):
            if i & (1 << j):
                k |= 1 << l[j]
        ret.append(k)
    return ret
# aとbを繋げる
def merge(a, b, margin):
    return (a << margin) + b
# nビットのマスク
def mask(n):
    return (1 << n) - 1
n,a,b = map(int,"2 1 3".split())
res = solve(n, a, b)
print('YES')
print(*res)
# for i in res:
#     print(bin(2 ** n + i)[3:])
# print("len :", len(res))
