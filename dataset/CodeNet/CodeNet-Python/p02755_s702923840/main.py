a, b = map(int, input().split())
x = [0]*10
for i in range(10):
    x[i] = b*10 + i
#print(x)

for i in range(10):
    if a == int(x[i]*0.08):
        print(x[i])
        break
else:
    print(-1)