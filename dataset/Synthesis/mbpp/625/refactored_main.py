newList = [1,2,3]
size = len(newList) 
temp = newList[0] 
newList[0] = newList[size - 1] 
newList[size - 1] = temp   
print(newList)