line = 'abab'
equalityMap = [('a', 'b'), ('b', 'a')]
rs = {
    k[0]: k[1] for k in equalityMap
}
print(line.translate(str.maketrans(rs)))