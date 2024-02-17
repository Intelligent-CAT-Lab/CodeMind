n=int("2")
for i in range(1,3501):
  for j in range(i,3501):
    if (4*i*j-n*(i+j))>0 and n*i*j%(4*i*j-n*(i+j))==0:
      k=n*i*j//(4*i*j-n*(i+j))
      break
  else:
    continue
  break
print(i,j,k)