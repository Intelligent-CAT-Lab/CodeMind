array = [1, 2, 3]
const = -1
output = ['x']
for i in range(1, len(array) + 1):
    if i % 2 != 0:
        output.append(array[i - 1] * -2)
    else:
        output.append(const)
print(output)