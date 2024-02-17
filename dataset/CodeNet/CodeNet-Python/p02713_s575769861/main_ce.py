import fractions as fr
k = int("2")
ans = (k+1)*k//2
tttt = [[0]*(k+1) for _ in range(k+1)]
for i in range(1, k+1):
  for j in range(1, k+1):
    if i == j:
      continue
    else:
      if tttt[i][j] != 0:
        g = tttt[i][j]
        ans += 3*g
      else:
        g = fr.gcd(i,j)
        tttt[i][j] = g
        tttt[j][i] = g
        ans += 3*g
for i in range(1, k-1):
  for j in range(i+1, k):
    for l in range(j+1, k+1):
      temp = tttt[i][j]
      temp2 = tttt[temp][l]
      ans+= 6*temp2
print(ans)