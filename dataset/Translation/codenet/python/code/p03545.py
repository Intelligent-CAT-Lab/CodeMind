n = input()

a = int(n[0])
b = int(n[1])
c = int(n[2])
d = int(n[3])

if (a+b+c+d) == 7:
    print(a, "+" ,b, "+" ,c, "+", d, "=7", sep="")
elif (a+b+c-d) == 7:
    print(a, "+" ,b, "+" ,c, "-", d, "=7", sep="")
elif (a+b-c+d) == 7:
    print(a, "+" ,b, "-" ,c, "+", d, "=7", sep="")
elif (a+b-c-d) == 7:
    print(a, "+" ,b, "-" ,c, "-", d, "=7", sep="")
elif (a-b+c+d) == 7:
    print(a, "-" ,b, "+" ,c, "+", d, "=7", sep="")
elif (a-b+c-d) == 7:
    print(a, "-" ,b, "+" ,c, "-", d, "=7", sep="")
elif (a-b-c+d) == 7:
    print(a, "-" ,b, "-" ,c, "+", d, "=7", sep="")
elif (a-b-c-d) == 7:
    print(a, "-" ,b, "-" ,c, "-", d, "=7", sep="")