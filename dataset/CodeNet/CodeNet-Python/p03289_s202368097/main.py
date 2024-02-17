word=input()
cflg=True
if word[0]!='A':
  cflg=False
elif word[2:-1].count('C')!=1:
  cflg=False
cnt=0
for l in word[1:]:
  if l.isupper():
    cnt+=1
else:
  if cnt!=1:
    cflg=False
  
if cflg:
  print('AC')
else:
  print('WA')
