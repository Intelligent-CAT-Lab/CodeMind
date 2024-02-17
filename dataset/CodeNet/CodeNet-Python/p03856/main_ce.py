S="erasedream"
a=["dream","dreamer","erase","eraser","dreamerase","dreameraser"]
numlist=[0,0,0,0,0,0]
for i in range(len(a)):
    numlist[i]=S.count(a[i])
numlist[0]-=numlist[1]
numlist[2]-=numlist[3]
numlist[4]-=numlist[5]
numlist[1]-=(numlist[4]+numlist[5])   #誤ってdreamerで数えた分を
numlist[0]+=(numlist[4]+numlist[5])   #dreamに計上しなおす
total=numlist[0]*5+numlist[1]*7+numlist[2]*5+numlist[3]*6
if total==len(S):
    print("YES")
else:
    print("NO")
