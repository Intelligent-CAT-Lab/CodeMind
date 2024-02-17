s="RRLRL"+'R' #以下ではRが出てきたときに値を更新しているので最後にRを付け加える
l=len(s)
ans=[0]*(l-1) #すべてのマスの答えを0で初期化
rcnt=0
lcnt=0
rpos=0
lpos=0
flag=0
for i in range(l):
 if s[i]=='R':
   if flag==1: #文字列がLRとなっているとき、直前のRLについて答えを求める
     if rcnt%2==0: #Rの個数が偶数のとき
       ans[rpos]+=rcnt//2
       ans[lpos]+=rcnt//2
     else: #Rの個数が奇数のとき
       ans[rpos]+=rcnt//2+1
       ans[lpos]+=rcnt//2
     if lcnt%2==0: #Lの個数が偶数のとき
       ans[rpos]+=lcnt//2
       ans[lpos]+=lcnt//2
     else: #Lの個数が奇数のとき
       ans[rpos]+=lcnt//2
       ans[lpos]+=lcnt//2+1
     rcnt=0
     lcnt=0
   flag=0
   rcnt+=1 #Rの個数を求める
   rpos=i #右端のRの位置を求める
 elif s[i]=='L':
   if flag==0:
     lpos=i #左端のLの位置を求める
   lcnt+=1 #Lの個数を求める
   flag=1
print(*ans)