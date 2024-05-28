A = [5,4,7,2,1]
N = 5
oddPair = 0
for i in range(0,N) :  
    for j in range(i+1,N) :  
        if ((A[i] ^ A[j]) % 2 != 0):  
            oddPair+=1  
print(oddPair)