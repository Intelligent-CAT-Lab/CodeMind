def f(lists):
    lists[1].clear()	## <state>lists = CLRJ</state>
    lists[2] += lists[1]	## <state>lists = CLRJ</state>
    return lists[0]	## <state>lists = CLRJ</state>
