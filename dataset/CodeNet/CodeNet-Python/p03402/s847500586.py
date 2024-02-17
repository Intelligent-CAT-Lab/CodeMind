A,B = map(int,input().split())
X = []
for i in range(100):
    defC = "." if i<50 else "#"
    line = [defC for _ in range(100)]
    X.append(line)

h,w = (B-1)//50,(B-1)%50
for i in range(h):
    for j in range(50):
        X[i*2][j*2] = "#"
for i in range(w):
    X[h*2][i*2] = "#"

h,w = (A-1)//50,(A-1)%50
for i in range(h):
    for j in range(50):
        X[i*2+51][j*2] = "."
for i in range(w):
    X[h*2+51][i*2] = "."

print(100,100)
for i in range(100):
    print("".join(X[i]))