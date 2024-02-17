def f(list):
    original = list[:]
    while len(list) > 1:
        list.pop(len(list) - 1)
        for i in range(len(list)):
            list.pop(i)
    list = original[:]
    if list:
        list.pop(0)
    return list