forest = '2imo 12 tfiqr.'
animal = 'm'
index = forest.index(animal)
result = list(forest)
while index < len(forest)-1:
    result[index] = forest[index+1]
    index += 1
if index == len(forest)-1:
    result[index] = '-'
print(''.join(result))