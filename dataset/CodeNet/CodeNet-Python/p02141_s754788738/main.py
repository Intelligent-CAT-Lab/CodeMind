W, H, w, h, x, y = map(lambda x: int(x)*2, raw_input().split())
X1 = -W/2
X2 =  W/2
Y1 = -H/2
Y2 =  H/2
x1 = max(x - w/2, X1)
y1 = max(y - h/2, Y1)
x2 = min(x + w/2, X2)
y2 = min(y + h/2, Y2)
mx = (x1 + x2) / 2.0
my = (y1 + y2) / 2.0
print "%.10f" % (my / mx)

