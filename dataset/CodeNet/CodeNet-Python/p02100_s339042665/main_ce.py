#E
import re
s = "+"+"x^2+3x+2"
c = 0
k = [0 for i in range(6)]
while c<len(s):
    find_1 = re.search(r'^([\+\-])x\^([2-5])', s[c:])
    if find_1:
        k[int(find_1.group(2))] = int(str(find_1.group(1))+"1")
        c += find_1.end()
        continue
    find_2 = re.search(r'^([\+\-][1-9][0-9]*)x\^([2-5])', s[c:])
    if find_2:
        k[int(find_2.group(2))] = int(str(find_2.group(1)))
        c += find_2.end()
        continue
    find_3 = re.search(r'^([\+\-][1-9][0-9]*)x', s[c:])
    if find_3:
        k[1] = int(str(find_3.group(1)))
        c += find_3.end()
        continue
    find_4 = re.search(r'^([\+\-])x', s[c:])
    if find_4:
        k[1] = int(str(find_4.group(1))+"1")
        c += find_4.end()
        continue
    find_5 = re.search(r'^([\+\-][1-9][0-9]*)', s[c:])
    if find_5:
        k[0] = int(str(find_5.group(1)))
        c += find_5.end()
        continue
#print(k)
#
ans = ""
que = list(range(abs(k[0]), -abs(k[0])-1, -1))
#print(que)
while True:
    buf = [0 for i in range(6)]
    n = que[0]
    p = 5
    while(k[p] == 0): p-=1
#    print(p)
    if p==0: break
    buf[p] = k[p]
    while p>0:
        p -= 1
        buf[p] = k[p] + n * buf[p+1]
#    print(k)
#    print(buf)
    if buf[0] == 0:
        k = buf[1:]+[0]
        if n < 0:
            ans += "(x+"+str(-n)+")"
        else:
            ans += "(x"+str(-n)+")"
    else:
        que.pop(0)
print(ans)
