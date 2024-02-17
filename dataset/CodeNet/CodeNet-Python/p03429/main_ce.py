n,m,a,b=map(int,"3 4 4 2".split())
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
        print('YES')
        for i in range(n):
          print(''.join(map(str,board[i])))
else:
  if (n*m)%2!=1:
    if n%2==1:
      tmp=min(m//2,a)
      a-=tmp
      for i in range(tmp):
        board[n-1][2*i]='<'
        board[n-1][2*i+1]='>'
    if m%2==1:
      tmp=min(n//2,b)
      b-=tmp
      for i in range(tmp):
        board[2*i][m-1]='^'
        board[2*i+1][m-1]='v'
    for y in range(0,n-(n%2),2):
      for x in range(0,m-(m%2),2):
        if a>=2:
          a-=2
          board[y][x]='<'
          board[y][x+1]='>'
          board[y+1][x]='<'
          board[y+1][x+1]='>'
        elif a==1:
          a-=1
          board[y][x]='<'
          board[y][x+1]='>'
        elif b>=2:
          b-=2
          board[y][x]='^'
          board[y+1][x]='v'
          board[y][x+1]='^'
          board[y+1][x+1]='v'
        elif b==1:
          b-=1
          board[y][x]='^'
          board[y+1][x]='v'
    if a!=0 or b!=0:
      print('NO')
    else:
      print('YES')
      for i in range(n):
        print(''.join(map(str,board[i])))
  else:
    if n%2==1:
      tmp=min(m//2-1,a)
      a-=tmp
      for i in range(tmp):
        board[n-1][2*i]='<'
        board[n-1][2*i+1]='>'
    if m%2==1:
      tmp=min(n//2-1,b)
      b-=tmp
      for i in range(tmp):
        board[2*i][m-1]='^'
        board[2*i+1][m-1]='v'
    for y in range(0,n-2,2):
      for x in range(0,m-2,2):
        if y==n-3 and x==m-3:
          continue
        if a>=b:
          if a>=2:
            a-=2
            board[y][x]='<'
            board[y][x+1]='>'
            board[y+1][x]='<'
            board[y+1][x+1]='>'
          elif a==1:
            a-=1
            board[y][x]='<'
            board[y][x+1]='>'
        else:
          if b>=2:
            b-=2
            board[y][x]='^'
            board[y+1][x]='v'
            board[y][x+1]='^'
            board[y+1][x+1]='v'
          elif b==1:
            b-=1
            board[y][x]='^'
            board[y+1][x]='v'
    if a>=4 or b>=4 or a+b>=5:
      print('NO')
      exit()
    x=m-3
    y=n-3
    if a==2 and b==2:
      a-=2
      b-=2
      board[y][x]='<'
      board[y][x+1]='>'
      board[y][x+2]='^'
      board[y+1][x+2]='v'
      board[y+1][x]='^'
      board[y+2][x]='v'
      board[y+2][x+1]='<'
      board[y+2][x+2]='>'
    else:
      if a!=0:
        a-=1
        board[y+2][x]='<'
        board[y+2][x+1]='>'
      if b!=0:
        b-=1
        board[y][x+2]='^'
        board[y+1][x+2]='v'
      if a>=2:
        a-=2
        board[y][x]='<'
        board[y][x+1]='>'
        board[y+1][x]='<'
        board[y+1][x+1]='>'
      elif a==1:
        a-=1
        board[y][x]='<'
        board[y][x+1]='>'
      elif b>=2:
        b-=2
        board[y][x]='^'
        board[y+1][x]='v'
        board[y][x+1]='^'
        board[y+1][x+1]='v'
      elif b==1:
        b-=1
        board[y][x]='^'
        board[y+1][x]='v'
    print('YES')
    for i in range(n):
      print(''.join(map(str,board[i])))