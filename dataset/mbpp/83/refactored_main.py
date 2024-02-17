strr = "abc"
summ = 0
for i in range(len(strr)): 
    summ += (ord(strr[i]) - ord('a') + 1)  
if (summ % 26 == 0): 
    result = ord('z') 
else: 
    summ = summ % 26
    result = chr(ord('a') + summ - 1)

print(result)