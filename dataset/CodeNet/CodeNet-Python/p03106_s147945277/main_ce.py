a,b,k = map(int,"8 12 2".split())
ans = []
for val in range(1,min(a,b)+1):
    #print(val)
    if a % val == 0 and b % val ==0:
        ans.append(val)
        #print(val)
print(ans[-k])