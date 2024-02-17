import math as m
A,B,C=(float(x) for x in "3 0 10".split())
a=m.ceil(C/A)
s=7*A+B
t=C//s
#sは1週間にもらえるコインの枚数
u=C-s*t
#uは端数
v=m.ceil(u/A)
if v<=7:
    b=7*t+v
else:
    b=7*t+7
if a>b:
    print(int(b))
else:
    print(int(a))
