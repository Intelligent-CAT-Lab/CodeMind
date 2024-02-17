def f(matrix):
    matrix.reverse()
    result = []
    for primary in matrix:
        max(primary)
        primary.sort(reverse = True)
        result.append(primary)
    return result