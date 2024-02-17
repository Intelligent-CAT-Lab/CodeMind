N=int(eval(input()))
X=P=0
for i in range(10) :
  P=i*111
  if X < N and N <= P :
    print(P)
  X=P
    