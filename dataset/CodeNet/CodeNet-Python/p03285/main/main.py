N = int(eval(input()))
for i in range(25):
  for j in range(20):
    if 4*i + 7*j == N:
      print('Yes')
      exit()
print('No')