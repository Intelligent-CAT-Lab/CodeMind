# coding:utf-8
K, A, B = map(int, "4000 2000 500".split())
if K <=A:
    print 1
elif A <= B:
    print -1
else:
    x = (K-B-1)/(A-B)+1
    print 2*x-1