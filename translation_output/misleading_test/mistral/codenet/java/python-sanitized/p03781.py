x = int(input())
i = 1
for i in range(1, x+1):
    if i*(i+1)//2 < x:
        break
print(i)