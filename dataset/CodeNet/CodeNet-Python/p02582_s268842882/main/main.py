S = eval(input())

cur_l, max_l = 0, 0

for s in S:
  if s == 'R':
    cur_l += 1
  else: # s == 'R'
    if cur_l > max_l:
      max_l = cur_l
    cur_l = 0

if cur_l > max_l:
  max_l = cur_l

print(max_l) 

