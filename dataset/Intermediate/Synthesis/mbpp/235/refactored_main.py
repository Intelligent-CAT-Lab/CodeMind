n = 10
count = 0
res = 0
temp = n 
while(temp > 0): 
    if (count % 2 == 1): 
        res |= (1 << count)
    count+=1
    temp >>= 1
print(n | res)