n=int(input())
for i in range(1,10):
    if n%i==0 and n/i<10:
      print("Yes")
      exit()
print("No")
