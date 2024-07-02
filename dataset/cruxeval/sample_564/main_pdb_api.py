def f(lists):
    lists[1].clear()
    lists[2] += lists[1]
    return lists[0]
f([[395, 666, 7, 4], [], [4223, 111]])