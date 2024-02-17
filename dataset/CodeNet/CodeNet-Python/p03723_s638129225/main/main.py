a,b,c = list(map(int, input().split()))
if  a==b==c and a%2 ==0:
    print((-1))
else:
    res = 0
    while True:
        if a%2 != 0 or b%2 != 0 or c%2 != 0:
            break
        a, b, c = (b+c)//2, (a+c)//2, (a+b)//2
        res += 1
    print(res)