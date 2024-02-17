import math
x1,y1,x2,y2 = list(map(float, input().split()))
dist = math.sqrt((x2-x1)**2+(y2-y1)**2)
print(("%.6f" % (dist)))