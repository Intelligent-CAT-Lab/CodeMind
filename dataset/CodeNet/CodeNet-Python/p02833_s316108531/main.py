n=int(input())

if n%2==1:
    print(0)
else:
    i = 1
    cnt = 0
    n1 = n
    while n1 != 0:
        n1 = n
        n1 = n1//(2*(5**i))
        cnt += n1
        i += 1
    print(cnt)