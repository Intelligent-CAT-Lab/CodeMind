A=[int(x)for x in "5 5 7".split()]
A.sort()
if A[0]==5 and A[1]==5 and A[2]==7:
  print("YES")
else:
  print("NO")