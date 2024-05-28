n = 1234
for i in range(10): 
    temp = n 
    count = 0; 
    while (temp): 
        if (temp % 10 == i): 
            count+=1
        if (count > i): 
            print(False)
            break
        temp //= 10
print(True)