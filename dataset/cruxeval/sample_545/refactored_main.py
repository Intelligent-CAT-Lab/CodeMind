array = [8, 8, -4, -9, 2, 8, -1, 8]
result = []
index = 0
while index < len(array):
    result.append(array.pop())
    index += 2
print(result)