def f(lists):
    lists[1].clear()	## {"lists" : ''}
    lists[2] += lists[1]	## {"lists" : ''}
    return lists[0]	## {"lists" : ''}
