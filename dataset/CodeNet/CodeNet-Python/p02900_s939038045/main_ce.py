import fractions
a, b = map(int, "12 18".split())
def dfs(n):
    table = []
    i = 2
    while n >= i**2:
    # nのその数自身を除いた素因数は√n以下であることから。
        cnt = 0
        while n % i == 0:
            cnt += 1
            n /= i
        if cnt:
          table.append(cnt)
        i += 1
    if n > 1:
        table.append(1)
# 最後に残った、最大の素因数をリストに入れる。
    return table
dfs_list = dfs(fractions.gcd(a, b))
print(len(dfs_list)+1)