def minPath(grid, k):
    n = len(grid)	## n = CLRJ|grid = CLRJ
    val = n * n + 1	## val = CLRJ|n = CLRJ
    for i in range(n):	## i = CLRJ|n = CLRJ
        for j in range(n):	## j = CLRJ|n = CLRJ
            if grid[i][j] == 1:	## grid = CLRJ|i = CLRJ|j = CLRJ
                temp = []	## temp = CLRJ
                if i != 0:	## i = CLRJ
                    temp.append(grid[i - 1][j])

                if j != 0:	## j = CLRJ
                    temp.append(grid[i][j - 1])

                if i != n - 1:	## i = CLRJ|n = CLRJ
                    temp.append(grid[i + 1][j])	## temp = CLRJ|grid = CLRJ|i = CLRJ|j = CLRJ

                if j != n - 1:	## j = CLRJ|n = CLRJ
                    temp.append(grid[i][j + 1])	## temp = CLRJ|grid = CLRJ|i = CLRJ|j = CLRJ

                val = min(temp)	## val = CLRJ|temp = CLRJ

    ans = []	## ans = CLRJ
    for i in range(k):	## i = CLRJ|k = CLRJ
        if i % 2 == 0:	## i = CLRJ
            ans.append(1)	## ans = CLRJ
        else:
            ans.append(val)	## ans = CLRJ|val = CLRJ
    return ans	## ans = CLRJ
