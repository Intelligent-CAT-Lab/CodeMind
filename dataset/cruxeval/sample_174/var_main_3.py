def f(lst):
    lst[1:4] = lst[1:4][::-1]	## <state>lst = CLRJ</state>
    return lst	## <state>lst = CLRJ</state>
