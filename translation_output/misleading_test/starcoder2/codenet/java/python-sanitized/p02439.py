a,b,c = map(int,input().split())
min = a if a<b else b
max = a if a>b else b
print(min,max)