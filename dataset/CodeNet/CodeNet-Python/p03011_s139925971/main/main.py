P, Q, R = list(map(int, input().split()))
print((min([P+Q, Q+R, R+P])))