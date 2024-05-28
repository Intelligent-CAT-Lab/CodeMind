x = 12
y = x ^ (x >> 1); 
y = y ^ (y >> 2); 
y = y ^ (y >> 4); 
y = y ^ (y >> 8); 
y = y ^ (y >> 16); 
if (y & 1): 
    print(True)
else: 
    print(False)