my_matrix = [[7, 12, 1, 14], [2, 13, 8, 11], [16, 3, 10, 5], [9, 6, 15, 4]]
iSize = len(my_matrix[0])
sum_list = []
sum_list.extend([sum (lines) for lines in my_matrix])   
for col in range(iSize):
    sum_list.append(sum(row[col] for row in my_matrix))
result1 = 0
for i in range(0,iSize):
    result1 +=my_matrix[i][i]
sum_list.append(result1)      
result2 = 0
for i in range(iSize-1,-1,-1):
    result2 +=my_matrix[i][i]
sum_list.append(result2)
if len(set(sum_list))>1:
    print(False)
else: 
    print(True)