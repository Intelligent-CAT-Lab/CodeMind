def f(data, num):
    new_dict = {}
    temp = list(data.items())
    for i in range(len(temp) - 1, num - 1, -1):
        new_dict[temp[i]] = None
    return temp[num:] + list(new_dict.items())
f({1: 9, 2: 10, 3: 1}, 1)