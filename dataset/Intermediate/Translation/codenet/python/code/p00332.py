E,Y = map(int,input().split())

if E ==0:
    if 1912>Y:
        print("M"+str(Y-1867))
    elif 1926>Y:
        print("T"+str(Y-1911))
    elif 1989>Y:
        print("S"+str(Y-1925))
    else:
        print("H"+str(Y-1988))
elif E==1:
    print(1867+Y)
elif E==2:
    print(1911+Y)
elif E==3:
    print(1925+Y)
else:
    print(1988+Y)

