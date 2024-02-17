A,B,C,D=map(int,"3 8 7 1".split())
if A+B<C+D:
  print("Right")
elif A+B==C+D:
  print("Balanced")
else:
  print("Left")