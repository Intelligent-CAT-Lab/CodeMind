def f(ls, n):
    answer = 0	## <state>answer = CLRJ</state>
    for i in ls:	## <state>i = CLRJ | ls = CLRJ</state>
        if i[0] == n:	## <state>i = CLRJ | n = CLRJ</state>
            answer = i	## <state>answer = CLRJ | i = CLRJ</state>
    return answer	## <state>answer = CLRJ</state>
