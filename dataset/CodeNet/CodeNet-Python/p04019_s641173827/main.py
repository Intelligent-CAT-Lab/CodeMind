S = list(input())
S = list(set(S))

n,w,s,e = 0,0,0,0
for i in range(len(S)):
  if(S[i] == 'N'): n = 1
  elif(S[i] == 'W'): w = 1 
  elif(S[i] == 'S'): s = 1 
  elif(S[i] == 'E'): e = 1
    
judge = [n,w,s,e]
if((judge == [1,0,1,0])or(judge == [0,1,0,1])or(judge == [1,1,1,1])):
  print('Yes')
else:
  print('No')
  