
X=int(eval(input()))
Day=["mon","tue","wed","thu","fri","sat","sun"]
a=X%7
if a==2 or a==3:
  print((Day[a+3]))
elif a==4 or a==5 or a==6:
  print((Day[a-4]))
elif a==0 or a==1:
  print((Day[a+3]))
  

