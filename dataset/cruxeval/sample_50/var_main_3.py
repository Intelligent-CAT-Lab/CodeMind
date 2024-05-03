def f(lst):
    lst.clear()	## <state>lst = CLRJ</state>
    lst += [1] * (len(lst) + 1)	## <state>lst = CLRJ</state>
    return lst	## <state>lst = CLRJ</state>
