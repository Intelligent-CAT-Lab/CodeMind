lst = [['x', 'y'], ['a', 'b'], ['m', 'n']]
print([list(ele) for ele in list(zip(*lst))])