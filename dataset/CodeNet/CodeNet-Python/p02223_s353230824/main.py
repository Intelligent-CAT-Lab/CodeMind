n = int(input())

if n == 1:
    print(1)
    print(0)
    exit()
if n == 2:
    print(2)
    print(0)
    print(11)
    exit()

print(n-1)
for i in range(n-1):
    print("1" + "0"*i + "1")
    

