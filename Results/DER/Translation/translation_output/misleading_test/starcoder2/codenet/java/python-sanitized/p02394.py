work = input().split()
W = int(work[0])
H = int(work[1])
x = int(work[2])
y = int(work[3])
r = int(work[4])

judge = "Yes" if (x-r)>=0 and (x+r)<=W and (y-r)>=0 and (y+r)<=H else "No"

print(judge)