import numpy as np
x1, y1, x2, y2 = list(map(int, input().rstrip().split()))
a = complex(x1, y1)
b = complex(x2, y2)
length = abs(a-b)
c = (a-b) * complex(np.cos(-np.pi/2), np.sin(-np.pi/2)) + b
x3 = int(np.round(c.real))
y3 = int(np.round(c.imag))
d = (b-a) * complex(np.cos(np.pi/2), np.sin(np.pi/2)) + a
x4 = int(np.round(d.real))
y4 = int(np.round(d.imag))
print((x3, y3, x4, y4))
