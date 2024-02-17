H,W,h,w = map(int,input().split())
if H%h == 0 and W%w == 0:
    print('No')
    exit()
print('Yes')

n = 1000
if W%w:
    m = -((w-1)*n + 1)
    row = [m if i%w==w-1 else n for i in range(W)]
    for i in range(H):
        print(*row)
else:
    m = -((h-1)*n + 1)
    for i in range(H):
        if i%h == h-1:
            print(*([m] * W))
        else:
            print(*([n] * W))