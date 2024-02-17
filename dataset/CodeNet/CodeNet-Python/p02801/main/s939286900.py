C=eval(input())
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print((al[idx+1]))