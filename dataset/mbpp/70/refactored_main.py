Input = [(11, 22, 33), (44, 55, 66)]
k = 0 if not Input else len(Input[0])
flag = 1
for tuple in Input:
  if len(tuple) != k:
    flag = 0
    break
print(flag == 1)