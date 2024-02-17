h,w = map(int, input().split())

if h%3==0 or w%3==0:
    print(0)
    exit()

res = min(h,w)
for hi in range(1,h):
    b1 = hi*w
    b2 = (h-hi)*(w//2)
    b3 = (h-hi)*(w//2+w%2)
    res = min(res, max(b1,b2,b3)-min(b1,b2,b3))
for wi in range(1,w):
    b1 = wi*h
    b2 = (w-wi)*(h//2)
    b3 = (w-wi)*(h//2+h%2)
    res = min(res, max(b1,b2,b3) - min(b1,b2,b3))

print(res)
