n = 10
if not (n & (n + 1)): 
    print(n) 
pos, temp, count = 0, n, 0 
while temp: 
    if not (temp & 1): 
        pos = count      
    count += 1; temp>>=1
print((n | (1 << (pos))))