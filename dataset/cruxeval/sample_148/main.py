def f(forest, animal):
    index = forest.index(animal)
    result = list(forest)
    while index < len(forest)-1:
        result[index] = forest[index+1]
        index += 1
    if index == len(forest)-1:
        result[index] = '-'
    return ''.join(result)