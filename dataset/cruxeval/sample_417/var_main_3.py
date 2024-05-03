def f(lst):
    lst.reverse()	## <state>lst = CLRJ</state>
    lst.pop()	## <state>lst = CLRJ</state>
    lst.reverse()	## <state>lst = CLRJ</state>
    return lst	## <state>lst = CLRJ</state>
