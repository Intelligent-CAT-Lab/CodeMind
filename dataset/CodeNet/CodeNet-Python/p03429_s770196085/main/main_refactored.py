class main:
	N,M,A,B=list(map(int,input().split()))
	
	def solve(n,m,a,b):
	#そもそも絶対的にスペースが足りない場合
	  if a*2+b*2>n*m:
	    return False
	  else:
	    ans=[['.' for x in range(m)] for y in range(n)]
	#各タイルの残りをカウント
	    remainA=a
	    remainB=b
	#原点を起点として2枚を正方形にして敷き詰めていく
	    nx=0
	    ny=0
	#縦横の限界値をカウント
	    gx=n
	    gy=m
	#縦が奇数ならばnxを+1して、最初の行にAを並べる
	    if n%2:
	      nx=1
	      cnt=0
	      while True:
	        if cnt > m-2 or remainA==0:
	          break
	        ans[0][cnt]='<'
	        ans[0][cnt+1]='>'
	        remainA-=1
	        cnt+=2
	#横が奇数ならば限界値を-1して、最後の列にBを並べる
	    if m%2:
	      gy-=1
	      cnt=0
	      while True:
	        if cnt > n-2 or remainB==0:
	          break
	        ans[cnt][m-1]='^'
	        ans[cnt+1][m-1]='v'
	        remainB-=1
	        cnt+=2
	#以上で縦横どちらかが1列行の場合の処理終わり。ABが残っていたらFalse
	    if (n==1 or m==1) and (remainA>0 or remainB>0):
	      return False
	#残り枚数を2枚ずつ消化するので、for文のために残数を変数にセット。
	    cna=remainA
	    cnb=remainB
	#まずはBを敷き詰める。
	    for i in range(cnb//2):
	      ans[nx][ny]='^'
	      ans[nx+1][ny]='v'
	      ans[nx][ny+1]='^'
	      ans[nx+1][ny+1]='v'
	      remainB-=2
	#横軸方向に+2、出来なければ、縦軸方向に+2して横軸位置を0に。
	      if ny+2 < gy-1:
	        ny+=2
	      elif nx+2 < gx-1:
	        nx+=2
	        ny=0
	#移動できなければ、そこで終了。ABが残っていればFalse。残っていなければ正解タイル。
	      else:
	        if remainA>0 or remainB>0:
	          return False
	        else:
	          return ans
	#次にAを敷き詰める。
	    for i in range(cna//2):
	      ans[nx][ny]='<'
	      ans[nx][ny+1]='>'
	      ans[nx+1][ny]='<'
	      ans[nx+1][ny+1]='>'
	      remainA-=2
	#横軸方向に+2、出来なければ、縦軸方向に+2して横軸位置を0に。
	      if ny+2 < gy-1:
	        ny+=2
	      elif nx+2 < gx-1:
	        nx+=2
	        ny=0
	#移動できなければ、そこで終了。ABが残っていればFalse。残っていなければ正解タイル。
	      else:
	        if remainA>0 or remainB>0:
	          return False
	        else:
	          return ans
	#x2で敷き詰め終えたので、残数と状況を調査。残っている各タイルは最大1つ
	    if remainA%2==0 and remainB%2==0:
	      return ans
	#両方1つずつ残っている場合、2x2が2つ必要。条件からgx/gyは偶数なので。
	    elif remainA%2==1 and remainB%2==1:
	      ans[nx][ny]='^'
	      ans[nx+1][ny]='v'
	      if ny+2 < gy-1:
	        ny+=2
	      elif nx+2 < gx-1:
	        nx+=2
	        ny=0
	#移動できなくてかつ隅が空いてなければAを置くことができない。
	      else:
	        if ans[n-1][m-1]=='.'  and ans[n-1][m-2]=='.':
	          ans[n-1][m-1]='>'
	          ans[n-1][m-2]='<'
	          return ans
	        return False
	#移動できたのでAを置いてreturn
	      ans[nx][ny]='<'
	      ans[nx][ny+1]='>'
	      return ans
	#Aだけが残っている場合はAを置いてreturn
	    elif remainA%2==1:
	      ans[nx][ny]='<'
	      ans[nx][ny+1]='>'
	      return ans
	#Bだけが残っている場合はBを置いてreturn
	    else:
	      ans[nx][ny]='^'
	      ans[nx+1][ny]='v'
	      return ans
	
	Ans=solve(N,M,A,B)
	if Ans:
	  print("YES")
	  for i in range(N):
	    res="".join(Ans[i])
	    print(res)
	else:
	  print("NO")