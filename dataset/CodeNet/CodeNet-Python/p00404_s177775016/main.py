import sys
x,y = list(map(int, input().split()))

cnt = 1
xy = [0,0]
xy2 = [1,1]
if xy[0] <= x < xy2[0] and xy[1] <= y < xy2[1]:
    print(cnt)
    sys.exit(0)
while 1:
    if cnt % 4 == 1:
        xy2[0] += xy2[1] - xy[1]
    elif cnt % 4 == 2:
        xy2[1] += xy2[0] - xy[0] 
    elif cnt % 4 == 3:
        xy[0] -= xy2[1] - xy[1]
    elif cnt % 4 == 0:
        xy[1] -= xy2[0] - xy[0]
    if xy[0] <= x < xy2[0] and xy[1] <= y < xy2[1]:
        print((cnt % 3) + 1)
        break
    cnt += 1
    

        
