N = int("432")
for i in range(50001):
    if N == int(i * 1.08):
        print(i)
        exit(0)
print(':(')