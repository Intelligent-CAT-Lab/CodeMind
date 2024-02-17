
"""
Writer: SPD_9X2
https://atcoder.jp/contests/cf16-final-open/tasks/codefestival_2016_final_f

街を、初めて訪れる順に順番つけすると街の順列を考えずに済むようになる

まだ未訪問を状態0
訪問したが、町1に戻れない街を、状態1
街0にたどり着くことが出来る街を、状態2 とする

出来ることは高々3つ。
未訪問の街に行く→状態0の街が一つ減り、1の街が1つ増える
状態1の街に行く→なにも変化なし
状態2の街に行く→状態1の街が全て2に変わる

あとはこれでdpしてあげて、順列を掛けてあげれば終わり!
→べつにdp推移中に計算すればokだった

dp推移は、dp[未訪問の街の数][状態1の街の数] = 移動の数
でおｋ O(N**3)で解ける。

"""

N,M = map(int,input().split())

dp = [ [0] * N for i in range(N) ]
dp[N-1][0] = 1
mod = 10**9+7

for loop in range(M):

    ndp = [ [0] * N for i in range(N) ]

    for i in range(N):

        for j in range(N):

            #未訪問に行く
            if i != 0 and j != N-1:
                ndp[i-1][j+1] += dp[i][j] * i
                ndp[i-1][j+1] %= mod

            #状態1の街に行く(少なくとも1つある場合)

            if j > 0:
                ndp[i][j] += dp[i][j] * j
                ndp[i][j] %= mod

            #状態2の街に行く

            ndp[i][0] += dp[i][j] * (N-i-j)
            ndp[i][0] %= mod

    dp = ndp

print (dp[0][0] % mod)