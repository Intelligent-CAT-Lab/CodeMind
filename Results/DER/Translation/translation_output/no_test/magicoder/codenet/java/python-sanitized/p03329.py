# åè:ãè²°ã DP ã¨é
ã DPãã¡ã¢ååå¸°ãåæ°å¶éãªãããããµãã¯åé¡ @drken https://qiita.com/drken/items/ace3142967c4f01d42e9#%E8%A7%A3%E6%B3%95-1-1-%E3%83%88%E3%83%83%E3%83%97%E3%83%80%E3%82%A6%E3%83%B3%E3%81%AB-n-%E3%82%92%E9%99%8D%E4%B8%8B%E3%81%97%E3%81%A6%E3%81%84%E3%81%8F%E3%83%A1%E3%83%A2%E5%8C%96%E5%86%8D%E5%B8%B0

MAX_N = 110000
memo = [-1] * MAX_N  # memo[i]:i=Nã®ã¨ãã®æä½å¤

def calc(n):
    if n == 0:
        return 0
    if memo[n] != -1:
        return memo[n]  # ã¡ã¢æ¸ã¿ãªããã®å¤ãè¿ã

    res = n  # 1åãã¤å¼ãåºããå ´å resã¯responseã®res?
    for pow6 in range(1, n + 1):
        pow6 *= 6
        res = min(res, calc(n - pow6) + 1)  # resã¨nãééãã¦ãã
    for pow9 in range(1, n + 1):
        pow9 *= 9
        res = min(res, calc(n - pow9) + 1)
    memo[n] = res
    return memo[n]

n = int(input())
ans = calc(n)
print(ans)