import math
h=int(input())
if h==1:
    print(1)
else:
    count=1
    sum=1
    while h>1:
        h=h/2
        sum+=math.pow(2,count)
        count+=1
    print(int(sum))