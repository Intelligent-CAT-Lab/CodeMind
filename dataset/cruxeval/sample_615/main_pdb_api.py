def f(in_list, num):
    in_list.append(num)
    return in_list.index(max(in_list[:-1]))
f([-1, 12, -6, -2], -1)