解析


n,m,a,b=map(int,input().split())



board=[['.']*m for _ in range(n)]



if n*m<2*(a+b):
  print('NO')
  exit()



if n==1 or m==1:
  if n==1 and m==1:
    if a==0 and b==0:
      print('YES')
      print('.')
    else:
      print('NO')
      exit()
  elif n==1:
    if b>=1:
      print('NO')
      exit()
    else:
      if m//2<a:
        print('NO')
        exit()
      else:
        for x in range(0,m//2):
          board[0][2*x]='<'
          board[0][2*x+1]='>'
        print('YES')
        for i in range(n):
          print(''.join(map(str,board[i])))
  elif m==1:
    if a>=1:
      print('NO')
      exit()
    else:
      if n//2<b:
        print('NO')
        exit()
      else:
        for y in range(0,n//2):
          board[2*y][0]='^'
          board[2*y+1][0]='v'
        print('YES