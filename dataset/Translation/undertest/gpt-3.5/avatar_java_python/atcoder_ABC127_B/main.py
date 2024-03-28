def atcoder_ABC127_B():
    r, d, x = map(int, input().split())

    for i in range(10):
        x = r * x - d
        print(x)

atcoder_ABC127_B()