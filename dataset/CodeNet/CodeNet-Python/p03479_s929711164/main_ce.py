X,Y=map(int,"3 20".split())
count=1
while True:
    X*=2
    if X>Y: break
    else: count+=1
print(count)