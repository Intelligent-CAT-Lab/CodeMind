string = 'asdfgh'
result = []

for i in range(len(string)):
    result.append(string[:i+1])
print(result)