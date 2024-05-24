list1 = [1,2,4,6,8,10,12,14,16,17]
result = all(list1[i] <= list1[i+1] for i in range(len(list1)-1))
print(result)