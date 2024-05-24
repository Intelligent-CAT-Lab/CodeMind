n = 1212121
n = str(n)
if (len(n) <= 2): 
    print(False)
for i in range(2, len(n)): 
    if (n[i - 2] != n[i]): 
        print(False)
print(True)