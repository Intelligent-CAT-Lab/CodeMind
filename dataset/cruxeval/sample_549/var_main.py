def f(matrix):
    matrix.reverse()	## {"matrix" : ''}
    result = []	## {"result" : ''}
    for primary in matrix:	## {"primary" : '',"matrix" : ''}
        max(primary)	## {"primary" : ''}
        primary.sort(reverse = True)	## {"primary" : ''}
        result.append(primary)	## {"result" : '',"primary" : ''}
    return result	## {"result" : ''}
