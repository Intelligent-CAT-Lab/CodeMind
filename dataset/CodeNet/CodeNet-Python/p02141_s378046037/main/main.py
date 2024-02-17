W,H,w,h,x,y = list(map(int, input().split()))
if x+w//2 <= W//2 and y+h//2 <= H//2:
    print((y/x))
    quit()
else:
    if x+w//2 > W//2:
        x = (x-w//2+W//2)/2
    if y+h//2 > H//2:
        y = (y-h//2+H//2)/2
    print((y/x))
    quit()
