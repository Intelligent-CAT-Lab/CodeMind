W, H, c = input().split()
W = int(W)
H = int(H)
for i in range(H) :
    for j in range(W) :
        if (i == 0 and j == 0) or (i == 0 and j == W-1) or (i == H-1 and j == 0) or (i == H-1 and j == W-1) :
            print('+', end='')
        elif i == 0 or i == H-1 :
            print('-', end='')
        elif j == 0 or j == W-1 :
            print('|', end='')
        elif i == ((H-1)//2) and j == ((W-1)//2) :
            print(c, end='')
        else :
            print('.', end='')
    print()
