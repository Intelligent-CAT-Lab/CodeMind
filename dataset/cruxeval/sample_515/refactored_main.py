array = [1, 2, 3, 4, 5]
result = array.copy()
result.reverse()
result[:] = [item * 2 for item in result]
print(result)