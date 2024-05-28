
"""
Writer: SPD_9X2
https://atcoder.jp/contests/tenka1-2019/tasks/tenka1_2019_f
Xが偶数か奇数かは重要な気がする
長さL(<=N)の1,2で構成された文字列の問題、に変換できる
O(L)で求められばおｋ
dpか？

X == 1なら、0,2のみで構成されてればおｋ
X == 2なら、1が2つ以上入っていたら不可能 0 & 1が1つまで
X == 3なら、2を入れる場合→1は入れられないが、2を好きなだけ入れていい
            入れない場合→1を2個まで入れられる
X == 4なら、

→やはり偶奇が重要か？

とどく場合は X-1　→ X+1の移動は強制
すなわち 座標1に行ってはいけない
初手は2に行くしかない
同様にX+2には行けない
X+3に行くしかない
3には行けないから4に行くしかない
つまり2以外不可？？ 

無限に移動を続ける場合は少なくともX=奇数 2のみ以外無理
偶数の場合はX以前に奇数回1をはさむ必要あり
a→a+1と移動すると、X+a-1から先は移動できなくなる

よって2Xは絶対超えられない
あとは数え上げにどうやって落とすか
Lは固定でいいと思うんだよな
O(L)で解ければ勝ち

dp ?
総和で場合分け or Lで場合分け
総和で場合分けする場合、当然Lは異なるのでまとめる必要がある
Lの長さの移動の寄与にはNCLを掛ける必要がある
移動するときにLは1増えるんだよな…
nC(l+1) = nCl * (n-l)/(l+1)
移動処理を一気に行えばlは統一できるからおｋ？

総和SはX以上の場合 X+1+2kしかありえない
S-X以前は2のみ進軍可能、以降は自由

対称性？
1と2の数を全探索？ ならばO(N**2)でいける
1がA個,2がB個の時、最初と最後に2をいくつか置く必要がある
→後は残りの位置から1を置く場所を選べばよい

→解けたっぽい？

場合分け頑張ろう

合計がX以下の場合→完全に自由
合計が2X以上の場合→Xが奇数の場合のみ all2が可能。それ以外は死
X以上2X以下の場合
→
    S-Xが奇数である必要あり
    まず2を(S-X+1)こ消費する（前後に置く分）
    あとは自由に順列を作ってどうぞ
    
"""

def modfac(n, MOD):
 
    f = 1
    factorials = [1]
    for m in range(1, n + 1):
        f *= m
        f %= MOD
        factorials.append(f)
    inv = pow(f, MOD - 2, MOD)
    invs = [1] * (n + 1)
    invs[n] = inv
    for m in range(n, 1, -1):
        inv *= m
        inv %= MOD
        invs[m - 1] = inv
    return factorials, invs


def modnCr(n,r,mod,fac,inv): #上で求めたfacとinvsを引数に入れるべし(上の関数で与えたnが計算できる最大のnになる)

    return fac[n] * inv[n-r] * inv[r] % mod


N,X = map(int,input().split())

mod = 998244353
fac,inv = modfac(N+10,mod)
ans = 0

for two in range(N+1):

    for one in range(N+1):

        if one + two > N:
            break
        
        dist = one + two*2
        zero = modnCr(N,one+two,mod,fac,inv)
        now = 0

        if dist < X:
            now = modnCr(one+two,one,mod,fac,inv) * zero
        elif dist == X:
            continue
        elif dist < 2*X:
            if (dist-X) % 2 == 0:
                continue
            dtwo = two - (dist-X+1)
            if dtwo >= 0:
                now = modnCr(one+dtwo,one,mod,fac,inv) * zero
        elif X % 2 == 1 and one == 0:
            now = zero

        #print (one,two,now)
        
        ans += now
        ans %= mod

print (ans)
            
