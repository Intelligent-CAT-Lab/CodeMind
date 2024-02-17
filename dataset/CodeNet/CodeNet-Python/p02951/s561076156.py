A, B, C = map(int, input().split())

get = A - B

i = C - get

if i < 0:
    i = 0
     
print(i)
