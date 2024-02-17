import math
x1,y1,x2,y2 = map(float, "0 0 1 1".split())
dist = math.sqrt((x2-x1)**2+(y2-y1)**2)
print("%.6f" % (dist))