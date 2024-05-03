def f(forest, animal):
    index = forest.index(animal)	## index = CLRJ | forest = CLRJ | animal = CLRJ
    result = list(forest)	## result = CLRJ | forest = CLRJ
    while index < len(forest)-1:	## index = CLRJ | forest = CLRJ
        result[index] = forest[index+1]	## result = CLRJ | index = CLRJ | forest = CLRJ
        index += 1	## index = CLRJ
    if index == len(forest)-1:	## index = CLRJ | forest = CLRJ
        result[index] = '-'	## result = CLRJ | index = CLRJ
    return ''.join(result)	## result = CLRJ
