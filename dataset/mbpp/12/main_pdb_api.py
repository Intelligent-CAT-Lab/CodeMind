def sort_matrix(M):
    result = sorted(M, key=sum)
    return result
sort_matrix([[1, 2, 3], [2, 4, 5], [1, 1, 1]])