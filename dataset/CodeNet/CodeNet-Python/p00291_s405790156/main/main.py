c1, c5, c10, c50, c100, c500 = list(map(int,input().split()))
sum = c1 + 5*c5 + 10*c10 + 50*c50 + 100*c100 + 500*c500
if sum >= 1000:
    print((1))
else:
    print((0))
