def f(lists):
    dic = {}	## {"dic" : ''}
    for n in lists:	## {"n" : '',"lists" : ''}
        if n in dic:	## {"n" : '',"dic" : ''}
            dic[n].append(lists.pop(lists.index(n)))	## {"dic" : '',"n" : '',"lists" : ''}
        else:
            dic[n] = lists[:lists.index(n) + 1]	## {"dic" : '',"n" : '',"lists" : ''}
    return str(dic).replace(' ', '')	## {"dic" : ''}
