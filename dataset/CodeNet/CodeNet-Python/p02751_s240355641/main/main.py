n, m = list(map(int, input().split()))
ans = [0, 1]
for i in range(1, min(n, m)):
    k = 1 << i
    x = (1 << k) - 1
    slide = [a << k for a in ans]
    new_ans = [s | a for s, a in zip(slide, ans)]
    new_ans.extend(s | (a ^ x) for s, a in zip(slide, ans))
    ans = new_ans
if n > m:
    ans *= 1 << (n - m)
elif n < m:
    for i in range(n, m):
        k = 1 << i
        ans = [(a << k) | a for a in ans]

ans = [a0 ^ a1 for a0, a1 in zip(ans, ans[1:])]
ans = [a ^ (a >> 1) for a in ans]

print(('\n'.join(map(('{:0' + str(2 ** m - 1) + 'b}').format, ans))))
