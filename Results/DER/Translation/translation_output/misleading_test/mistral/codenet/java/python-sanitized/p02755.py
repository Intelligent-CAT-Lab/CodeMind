A = int(input())
B = int(input())

if A > B:
    print(-1)
    exit()

for i in range(1, 100000000):
    if (i * 0.08) == A and (i * 0.10) == B:
        print(i)
        exit()
print(-1)