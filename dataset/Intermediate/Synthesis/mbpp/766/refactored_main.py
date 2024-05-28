l1 = [1,1,2,3,3,4,4,5]
temp = []
for i in range(len(l1) - 1):
    current_element, next_element = l1[i], l1[i + 1]
    x = (current_element, next_element)
    temp.append(x)
print(temp)