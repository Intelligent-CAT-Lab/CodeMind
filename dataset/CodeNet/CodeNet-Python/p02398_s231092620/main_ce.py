a,b,c = map(int,"5 14 80".split())
count = 0
for i in range(a,b+1):
    if c%i==0:
        count +=1
print(count)