
"""

https://atcoder.jp/contests/cf17-final/tasks/cf17_final_g

1回の操作で捨てられる石は1個
いくつ捨てられるかを考えた方がいいだろう

大きい方から?→そんなことはない
小さいほうから?→そんなことはない
今i=aiを満たしている中で最小のものからやるべき？→これはそう

数え上げなので…？ → X回とれる盤面は何通りあるか(1)
または、あるindexより右をX回選択できるindexより右側の数列は何通りか(2) → 左は自由

(2)の方がやりやすそう(Nはでかいとする)
→ 右端は1通り (Nのみ)
→ 右から2番目は 1回選択が N-1,A / 2回選択が N-2,N
→ 右から3番目は 1回選択が N-2,(0回選択)

右から順番に見てく？
100*100→10000個しか取れない
毎回何の数字か全探索したとしても 100^3で間に合う
取れる個数は100log100

3300 * 100 * 100 = 3.3*10^7
間に合いそう
"""

N,K = map(int,input().split())
mod = 10**9+7
lis = [0] * 3300
lis[0] = 1

for i in range(N,0,-1):

    nlis = [0] * 3300
    
    for j in range(K+1):

        for last in range(3300):

            if i < j:
                nlis[last] += lis[last]
                nlis[last] %= mod
            elif (last+j)//i + last < 3300:
                nlis[last+(last+j)//i] += lis[last]
                nlis[last+(last+j)//i] %= mod
                

    lis = nlis
    #print (lis[:20])

ans = K * (K+1) // 2 * pow(K+1,N-1,mod) * N
#print (ans)

for i in range(3300):
    ans -= lis[i] * i
    ans %= mod
print (ans)

"""
#test

ans = 0
for i in range(100,0,-1):
    ans += (ans//i) + 1
print (ans)
"""