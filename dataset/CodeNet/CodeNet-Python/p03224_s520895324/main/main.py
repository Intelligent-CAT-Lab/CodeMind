N = int(eval(input()))
for i in range(2000):
    if i*(i-1)//2 == N:
        c = 1
        X = [[] for _ in range(i)]
        for j in range(i):
            for k in range(j+1, i):
                X[j].append(c)
                X[k].append(c)
                c += 1
        print("Yes")
        print((len(X)))
        for x in X:
            print((len(x), *x))
        break
else:
    print("No")
