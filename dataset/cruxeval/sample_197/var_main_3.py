def f(temp, timeLimit):
    s = timeLimit // temp	## <state>s = CLRJ | timeLimit = CLRJ | temp = CLRJ</state>
    e = timeLimit % temp	## <state>e = CLRJ | timeLimit = CLRJ | temp = CLRJ</state>
    return [f'{e} oC', f'{s} {e}'][s > 1]	## <state>e = CLRJ | s = CLRJ</state>
