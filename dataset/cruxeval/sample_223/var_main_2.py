def f(array, target):
    count, i = 0, 1	## count = [] | i = []
    for j in range(1, len(array)):	## j = [] | array = []
        if ((array[j] > array[j-1]) and (array[j] <= target)): count += i	## array = [] | j = [] | target = [] | count = [] | i = []
        elif array[j] <= array[j-1]: i = 1	## array = [] | j = [] | i = []
        else: i += 1	## i = []
    return count	## count = []
