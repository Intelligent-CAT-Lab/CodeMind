list1 = [[1, 3], [5, 7], [1, 11], [1, 15, 7]]
x = 1
ctr = 0
for i in range(len(list1)): 
    if x in list1[i]: 
        ctr+= 1          
print(ctr)