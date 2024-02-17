a=eval(input())
count = 1
li=[]
for char in list(a):
    if count % 2 != 0:
        li.append(char)
        count+=1
    else:
        count+=1
b="".join(li)
print(b)


