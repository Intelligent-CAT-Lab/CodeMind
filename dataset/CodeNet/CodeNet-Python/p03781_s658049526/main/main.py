X = int(eval(input()))

for i in range(1,X+1):
  if i*(i+1)//2 >= X:
    print(i)
    break