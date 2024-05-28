list1 = [1,2,3,4,5,6,7,8]
list2 = [2,2,3,1,2,6,7,9]
list3 = [2,1,3,1,2,6,7,9]
result = sum(m == n == o for m, n, o in zip(list1,list2,list3))
print(result)