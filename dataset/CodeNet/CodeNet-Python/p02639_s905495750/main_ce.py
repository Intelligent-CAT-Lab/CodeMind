x = list(map(int, "0 2 3 4 5".split()))
for i in range(len(x)):
    if x[i] == 0:
        print(i+1)