n=[int(_) for _ in list(input())]
l=len(n)
if l==1:
    print(n[0])
elif n[0]!=9:
    if len(set(n[1:]))==1 and n[1]==9:
        print(n[0]+9*(l-1))
    else:
        print(n[0]-1+9*(l-1))
else:
    if len(set(n))==1:
        print(9*l)
    else:
        print(9*(l-1)+8)