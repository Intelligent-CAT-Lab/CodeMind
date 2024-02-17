H, W, a, b = list(map(int, input().split()))

if H%a or W%b:
    print('Yes')
    k = (H//a) * (W//b)
    x = k+2
    ansss = [[0]*(W) for _ in range(H)]
    for i in range(H//a):
        for j in range(W//b):
            ansss[(i+1)*a-1][(j+1)*b-1] = -x
    for i in range(-(-H//a)):
        for j in range(-(-W//b)):
            ansss[i*a][j*b] = x-1
    print(('\n'.join([' '.join(map(str, anss)) for anss in ansss])))
else:
    print('No')
