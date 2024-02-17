n = int("25")
lr_cnt = [[0 for _ in range(10)] for _ in range(10)]
for i in range(1, n + 1):
    str_i = str(i)
    start = int(str_i[0])
    end = int(str_i[-1])
    lr_cnt[start][end] += 1
ans = 0
for i in range(10):
    for j in range(10):
        ans += lr_cnt[i][j] * lr_cnt[j][i]
print(ans)
