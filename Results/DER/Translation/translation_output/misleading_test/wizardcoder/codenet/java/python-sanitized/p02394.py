import sys

#å
¥å
work=sys.stdin.readline().split()

W=int(work[0])
H=int(work[1])
x=int(work[2])
y=int(work[3])
r=int(work[4])

#å¤å®å¦ç
judge="No"
if (x-r)>=0 and (x+r)<=W:
    if ((y-r)>=0 and (y+r)<=H):
        judge="Yes"

#åºå
print(judge)