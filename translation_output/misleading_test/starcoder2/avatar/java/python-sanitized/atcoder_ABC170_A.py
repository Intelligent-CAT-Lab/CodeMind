count = list(map(int, input().split()))

for i in range(5):
    if count[i] == 0:
        print(i + 1)