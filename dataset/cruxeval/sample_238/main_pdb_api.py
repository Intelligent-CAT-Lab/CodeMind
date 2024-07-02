def f(ls, n):
    answer = 0
    for i in ls:
        if i[0] == n:
            answer = i
    return answer
f([[1, 9, 4], [83, 0, 5], [9, 6, 100]], 1)