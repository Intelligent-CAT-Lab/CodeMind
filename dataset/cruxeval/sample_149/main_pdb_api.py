def f(tuple_list, joint):
    string = ''
    for num in tuple_list:
        string += dict.fromkeys(str(num), joint * len(str(num))).popitem()[0] + joint
    return string
f((32332, 23543, 132323, 33300), ',')