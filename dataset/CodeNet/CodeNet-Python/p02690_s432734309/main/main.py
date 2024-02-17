x = int(eval(input()))
if int(x**0.2)==int(x)**0.2:
  print((int(x**0.2),0))
  exit()
for i in range(1,10**5):
  b = i
  c = -i
  x1 = x + b**5
  x2 = x + c**5
  if x1>=0 and int(x1**0.2)**5==x1:
    print((int(x1**0.2),b))
    exit()
  if x2>=0 and int(x2**0.2)**5==x2:
    print((int(x2**0.2),c))
    exit()
  if x2<0:
    for j in range(1,10**3):
      v = -j
      if v**5==x2:
        print((v,c))
        exit()