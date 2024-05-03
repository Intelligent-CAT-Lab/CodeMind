def get_row(lst, x):
    coords = [(i, j) for i in range(len(lst)) for j in range(len(lst[i])) if lst[i][j] == x]	## coords = CLRJ|lst = CLRJ|x = CLRJ
    return sorted(sorted(coords, key=lambda x: x[1], reverse=True), key=lambda x: x[0])	## coords = CLRJ|x = CLRJ
