list1 = ["python","PHP","bigdata"]
max=len(list1[0])
for i in list1:
    if len(i)>max:
        max=len(i)
print(max)