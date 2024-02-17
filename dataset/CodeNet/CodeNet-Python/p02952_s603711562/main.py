N = int(input())
count = 0
for i in range(1,N+1):
    if len(str(i)) % 2 == 1:
        count += 1
print(count)