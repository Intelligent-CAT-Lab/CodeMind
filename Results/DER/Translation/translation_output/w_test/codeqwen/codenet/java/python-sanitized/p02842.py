N = int(input())
for i in range(N+1):
    if int(i*1.08) == N:
        print(i)
        break
else:
    print(":(")