def f(vectors):
    sorted_vecs = []	## <state>sorted_vecs = CLRJ</state>
    for vec in vectors:	## <state>vectors = CLRJ</state>
        vec.sort()
        sorted_vecs.append(vec)
    return sorted_vecs	## <state>sorted_vecs = CLRJ</state>
