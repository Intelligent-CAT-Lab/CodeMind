str = 'abcdef'
result = "" 
for i in range(len(str)):
    if i % 2 == 0:
        result = result + str[i]
print(result)