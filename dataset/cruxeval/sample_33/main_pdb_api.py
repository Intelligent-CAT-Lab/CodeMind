def f(lists):
    dic = {}
    for n in lists:
        if n in dic:
            dic[n].append(lists.pop(lists.index(n)))
        else:
            dic[n] = lists[:lists.index(n) + 1]
    return str(dic).replace(' ', '')
f([5, 2, 7, 2, 3, 5])