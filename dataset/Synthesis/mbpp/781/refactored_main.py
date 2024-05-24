n = 10
count = 0
for i in range(1, (int)(math.sqrt(n)) + 2) : 
    if (n % i == 0) : 
        if( n // i == i) : 
            count = count + 1
        else : 
            count = count + 2
print(count % 2 == 0)