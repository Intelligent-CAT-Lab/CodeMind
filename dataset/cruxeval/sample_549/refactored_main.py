matrix = [[1, 1, 1, 1]]
matrix.reverse()
result = []
for primary in matrix:
    max(primary)
    primary.sort(reverse = True)
    result.append(primary)
print(result)