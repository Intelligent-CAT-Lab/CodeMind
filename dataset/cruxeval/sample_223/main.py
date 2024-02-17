def f(array, target):
    count, i = 0, 1
    for j in range(1, len(array)):
        if ((array[j] > array[j-1]) and (array[j] <= target)): count += i
        elif array[j] <= array[j-1]: i = 1
        else: i += 1
    return count