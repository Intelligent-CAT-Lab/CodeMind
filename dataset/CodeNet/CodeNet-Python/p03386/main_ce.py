A,B,K=map(int,"3 8 2".split())
X = [p for p in range(A,A+K) if p<=B]
Y = [q for q in range(B-K+1,B+1) if q>=A]
ans = list(set(X+Y))
ans.sort()
for i in ans:
  print(i)