def f(forest, animal):
    index = forest.index(animal)	## <state>index = CLRJ | forest = CLRJ | animal = CLRJ</state>
    result = list(forest)	## <state>result = CLRJ | forest = CLRJ</state>
    while index < len(forest)-1:	## <state>index = CLRJ | forest = CLRJ</state>
        result[index] = forest[index+1]	## <state>result = CLRJ | index = CLRJ | forest = CLRJ</state>
        index += 1	## <state>index = CLRJ</state>
    if index == len(forest)-1:	## <state>index = CLRJ | forest = CLRJ</state>
        result[index] = '-'	## <state>result = CLRJ | index = CLRJ</state>
    return ''.join(result)	## <state>result = CLRJ</state>
