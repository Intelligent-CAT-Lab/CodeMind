def f(lst):
    lst.clear()	## <state>lst = CLRJ</state>
    for i in lst:	## <state>lst = CLRJ</state>
        if i == 3:
            return False
    else:
        return True