def f(vectors):
    sorted_vecs = []	## {"sorted_vecs" : ''}
    for vec in vectors:	## {"vectors" : ''}
        vec.sort()
        sorted_vecs.append(vec)
    return sorted_vecs	## {"sorted_vecs" : ''}
