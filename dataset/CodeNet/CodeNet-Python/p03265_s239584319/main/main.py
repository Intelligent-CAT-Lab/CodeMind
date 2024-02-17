import numpy as np
x1,y1,x2,y2=[int(a) for a in input().split()]
p1 = np.array([x1,y1])
p2 = np.array([x2,y2])
v1 = p2-p1
v2 = np.array([-v1[1],v1[0]])
p3 = p2+v2
p4 = p3+(-v1)
print((" ".join([str(v) for v in list(p3)+list(p4)])))