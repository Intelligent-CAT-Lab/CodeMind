import math
inf=float('inf')
s = eval(input())
s=s[:-1]

if (len(s)%2==1):
    s=s[:-1]

N=len(s)

for i in range(N):
    h=int(len(s)/2)
    if (s[0:h-1]==s[h:-1]):

        print((len(s)))
        quit()
    s=s[:-2]


quit()