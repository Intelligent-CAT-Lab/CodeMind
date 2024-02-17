n=int(eval(input()))

dic={}
for i in range(1,50001):
    p=int(i*1.08)
    dic[p]=i
if n in dic:
    print((dic[n]))
else:
    print(":(")