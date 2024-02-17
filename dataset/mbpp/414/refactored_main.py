list1 = [1,2,3,4,5]
list2 = [6,7,8,9]
for i in range(len(list1)): 
    for j in range(len(list2)): 
        if(list1[i]==list2[j]): 
            print(True)
print(False)