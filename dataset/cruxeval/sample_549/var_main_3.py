def f(matrix):
    matrix.reverse()	## <state>matrix = CLRJ</state>
    result = []	## <state>result = CLRJ</state>
    for primary in matrix:	## <state>primary = CLRJ | matrix = CLRJ</state>
        max(primary)	## <state>primary = CLRJ</state>
        primary.sort(reverse = True)	## <state>primary = CLRJ</state>
        result.append(primary)	## <state>result = CLRJ | primary = CLRJ</state>
    return result	## <state>result = CLRJ</state>
