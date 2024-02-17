def f(list, start, end):
    count = 0
    for i in range(start, end):
        for j in range(i, end):
            if list[i] != list[j]:
                count += 1
    return count