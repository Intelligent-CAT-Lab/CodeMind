class main:
    W, H = map(int, input().split())
    c = input()
    x, y = (W - 1) // 2, (H - 1) // 2
    
    for i in range(H):
        for j in range(W):
            if j == 0 and i == 0 or j == 0 and i == H - 1 or j == W - 1 and i == 0 or j == W - 1 and i == H - 1:
                print("+", end="")
            elif j != 0 and j != W - 1 and i == 0 or j != 0 and j != W - 1 and i == H - 1:
                print("-", end="")
            elif i != 0 and i != H - 1 and j == 0 or i != 0 and i != H - 1 and j == W - 1:
                print("|", end="")
            elif j == x and i == y:
                print(c, end="")
            else:
                print(".", end="")
        print()