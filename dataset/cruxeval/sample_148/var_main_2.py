def f(forest, animal):
    index = forest.index(animal)	## index = [] | forest = [] | animal = []
    result = list(forest)	## result = [] | forest = []
    while index < len(forest)-1:	## index = [] | forest = []
        result[index] = forest[index+1]	## result = [] | index = [] | forest = []
        index += 1	## index = []
    if index == len(forest)-1:	## index = [] | forest = []
        result[index] = '-'	## result = [] | index = []
    return ''.join(result)	## result = []
