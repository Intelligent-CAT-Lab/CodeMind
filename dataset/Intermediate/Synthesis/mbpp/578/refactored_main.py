list1 = [1,2,3,4,5,6,7]
list2 = [10,20,30,40,50,60,70]
list3 = [100,200,300,400,500,600,700]
result = [el for pair in zip(list1, list2, list3) for el in pair]
print(result)