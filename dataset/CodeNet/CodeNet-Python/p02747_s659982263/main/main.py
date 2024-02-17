s = eval(input())
cnt = 0
for i in range(len(s)):
  if i % 2 == 0 and s[i] == 'h':
    cnt += 1
  elif i % 2 == 1 and s[i] == 'i':
    cnt += 1
if len(s) % 2 == 0 and cnt == len(s):
  print('Yes')
else:
  print('No')