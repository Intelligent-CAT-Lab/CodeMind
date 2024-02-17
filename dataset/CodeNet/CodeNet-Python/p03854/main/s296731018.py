S = eval(input())
if len(S) < 5:
  print('NO')
  exit()
else:
  i = 0
  while True:
    if (i+5 == len(S) and S[i:i+5]=='dream') or (i+5 == len(S) and S[i:i+5]=='erase') or (i+6 == len(S) and S[i:i+6]=='eraser') or (i+7 == len(S) and S[i:i+7]=='dreamer'):
      print('YES')
      exit()
    elif S[i:i+5]=='dream' and i+8 <= len(S):
      if S[i+5:i+8]=='erd' or S[i+5:i+8]=='ere': i+=7
      elif S[i+5:i+8]=='era' or S[i+5:i+6]=='d': i+=5
      else:
        print('NO')
        exit()
    elif S[i:i+5]=='erase'  and i+7 <= len(S):
      if S[i+5:i+6]=='e' or S[i+5:i+6]=='d': i+=5
      elif S[i+5:i+6]=='r': i+=6
      else:
        print('NO')
        exit()
    else:
        print('NO')
        exit()