s=str(eval(input()))

batu=s.count("x")
maru=s.count("o")
leng=len(s)

if 15-batu>=8:
    print("YES")
else:
    print("NO")