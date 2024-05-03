def f(lst, i, n):
    lst.insert(i, n)	## <state>lst = CLRJ | i = CLRJ | n = CLRJ</state>
    return lst	## <state>lst = CLRJ</state>
