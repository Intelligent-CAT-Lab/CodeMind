class main:
    a,b,c = map(int,input().split())
    sum = [a,b,c]
    sum.sort()
    print(sum[0]+sum[1])