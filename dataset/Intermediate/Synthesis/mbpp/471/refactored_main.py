arr = [ 100, 10, 5, 25, 35, 14 ]
n = 11
mul = 1
for i in range(len(arr)):  
    mul = (mul * (arr[i] % n)) % n 
print(mul % n)