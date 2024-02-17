N=int("10")
for i in range(1,10):
    for j in range(1,10):
        if(i*j==N):
            print('Yes')
            exit()
print('No')