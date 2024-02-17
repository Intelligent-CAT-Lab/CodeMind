# coding:utf-8

K, A, B = list(map(int, input().split()))
if K <=A:
    print(1)

elif A <= B:
    print(-1)
else:
    x = (K-B-1)/(A-B)+1
    print(2*x-1)