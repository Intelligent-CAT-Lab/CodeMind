def cmb(n, r, mod):
    if ( r<0 or r>n ):
        return 0
    r = min(r, n-r)
    return g1[n] * g2[r] * g2[n-r] % mod

X,Y = map(int,input().split())
if(X>Y): x,y = Y,X
else: x,y = X,Y
  
#1 : →↑↑ , 2 :→↑→
#1をi回使う ∧ 2をN-i回使う
ans = -1
for i in range(y+1):
  #i回 1を使い、N-i回 2を使う
  tmp_x,tmp_y = 2*i,1*i 
  res_x,res_y = x-tmp_x,y-tmp_y
  if(res_x > 0):
    if((res_y%res_x == 0)and(res_y//res_x == 2)):
     n1 = i
     n2 = res_x
     break
  elif(res_x == 0):
     if(res_y == 0):
       n1 = i
       n2 = i
     else: ans = 0
     break
  elif(res_x < 0):
    ans = 0
    break
    
if(ans != 0):
 mod = 10**9+7 #出力の制限
 N = n1+n2
 g1 = [1, 1] # 元テーブル
 g2 = [1, 1] #逆元テーブル
 inverse = [0, 1] #逆元テーブル計算用テーブル
 for i in range( 2, N + 1 ):
    g1.append( ( g1[-1] * i ) % mod )
    inverse.append( ( -inverse[mod % i] * (mod//i) ) % mod )
    g2.append( (g2[-1] * inverse[-1]) % mod )
 r = min(n1,n2)
 ans = cmb(N, r, mod)

  
if((x+y)%3 != 0): ans = 0
ans = ans%(10**9 + 7)
print(ans)