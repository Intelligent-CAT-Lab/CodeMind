N, K, M = map(int, input().split())
# limitの最大値（limitなし）
L = (N+1)//2+1

def even(n, k) :
    # dp[iまでみた][前のj個が連続]
    dp = [[0] * (k+1) for _ in range(n+1)]
    dp[0][0] = 1
    for i in range(n) :
        for j in range(k + 1) :
            dp[i+1][0] = (dp[i+1][0] + dp[i][j]) % M
            # 直前にK個連続しているときは追加できない
            if j != k :
                dp[i+1][j+1] = (dp[i+1][j+1] + dp[i][j]) % M
    
    return sum(dp[n]) % M

def loop(x, y) :
    return (2*x >= K+1 and 2*y >= K+3)
  
if K % 2 == 0 :
    print(even(N//2, K//2) * even((N+1)//2, K//2) % M)
    
else :
    # dp[x][y][z]
    # iとパリティが異なる列がx個連続、iとパリティが同じ列がy個連続でかつxとyのどちらかをzまで伸ばせる組み合わせ
    dp0 = [[[0]*(L+1) for _ in range(L+1)] for _ in range(L+1)]
    dp0[0][0][L] = 1
    
    for i in range(N) :
        dp1 = [[[0]*(L+1) for _ in range(L+1)] for _ in range(L+1)]
        for x in range(L+1) :
            for y in range(L+1) :
                if loop(x, y) : continue
                for z in range(max(x, y)+1, L+1) :
                    if dp0[x][y][z] == 0 :
                        continue
                    dp1[y][x+1][z] += dp0[x][y][z]
                    dp1[y][x+1][z] %= M
                    # zの更新
                    # (1) y > x のときはzを引き継ぎ y <= x のときはLにリセット
                    # (2) ↖ みたいな矢印が引ける時 つまり 2*y >= K+3 and x > 0の時 
                    # y - x + K//2 + 1 と (1)との最小値に更新
                    if y > x :
                        zz = z
                    else :
                        zz = L
                    if 2*y >= K+3 and x > 0 :
                        zz = min(zz, 1+y-x+K//2)
                    dp1[y][0][zz] += dp0[x][y][z]
                    dp1[y][0][zz] %= M
        dp0 = dp1
    
    ret = 0
    for x in range(L+1) :
        for y in range(L+1) :
            if loop(x, y) : continue
            for z in range(max(x, y)+1, L+1) :
                ret += dp0[x][y][z]
                ret %= M
                    
    print(ret)