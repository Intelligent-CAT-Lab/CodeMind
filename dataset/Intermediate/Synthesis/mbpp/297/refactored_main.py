list1 = [0, 10, [20, 30], 40, 50, [60, 70, 80], [90, 100, 110, 120]]
result_list = []
if not list1: 
    print(result_list)
else:
    stack = [list(list1)]
    while stack:
        c_num = stack.pop()
        next = c_num.pop()
        if c_num: stack.append(c_num)
        if isinstance(next, list):
            if next: stack.append(list(next))
        else: result_list.append(next)
    result_list.reverse()
    print(result_list)